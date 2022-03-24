package com.example.retou2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.retou2.databinding.FragmentDatosBinding
import com.example.retou2.databinding.FragmentFormBinding

class datosFragment : Fragment() {
    private lateinit var binding: FragmentDatosBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDatosBinding.inflate(layoutInflater)
        // Inflate the layout for this fragment
        val argumentoRecibido = arguments?.getString("argumentoPasado")
        val argumentoRecibido2 = arguments?.getString("argumentoPasado2")
        val argumentoRecibido3 = arguments?.getString("argumentoPasado3")
        val argumentoRecibido4 = arguments?.getString("argumentoPasado4")
        val argumentoRecibido5 = arguments?.getString("argumentoPasado5")
        binding.tvNombre.setText(argumentoRecibido)
        binding.tvApPat.setText(argumentoRecibido2)
        binding.tvApMat.setText(argumentoRecibido3)
        binding.tvUsuario.setText(argumentoRecibido4)
        binding.tvCorreo.setText(argumentoRecibido5)
        return binding.root
    }

}