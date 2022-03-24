package com.example.retou2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.retou2.databinding.FragmentFormBinding

class FormFragment : Fragment() {

    private lateinit var binding: FragmentFormBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFormBinding.inflate(inflater,container, false)
        val navController = findNavController()
        binding.btnEnviar.setOnClickListener(){


           // navController.navigate(R.id.action_formFragment_to_datosFragment
            val directions = FormFragmentDirections.actionFormFragmentToDatosFragment(binding.etNombre.text.toString(),
                binding.etApPat.text.toString(),
                binding.etApMat.text.toString(),
                binding.etUsuario.text.toString(),
                binding.etCorreo.text.toString())
            navController.navigate(directions)

        }

        return binding.root
    }

}