package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.myapplication.databinding.ActivityMainBinding
import com.example.myapplication.databinding.FragmentBlankBinding


/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment : Fragment() {

    private var _binding: FragmentBlankBinding? = null//Обьявили пуремеую

    private val binding get() = _binding!!
    private lateinit var rvAdapter: RvAdapter
    private lateinit var languageList : List<Language>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        var view = inflater.inflate(R.layout.fragment_blank, container, false)
//        return view
//        binding = ActivityMainBinding.inflate(layoutInflater)
        _binding = FragmentBlankBinding.inflate(inflater, container, false)//Инициализация
            //Биндинг - механизм который связывает разметку и класс
loadLanguage()
        var adapter:RvAdapter = RvAdapter(languageList)//Создали екземпляр класса RvAdahter
        // передав в конструктор класса список
        binding.rView.adapter = adapter
        return binding.root
    }
    private fun loadLanguage() {
        languageList = listOf(
            Language("Java" , "Exp : 3 years"),
            Language("Kotlin" , "Exp : 2 years"),
            Language("Python" , "Exp : 4 years"),
            Language("JavaScript" , "Exp : 6 years"),
            Language("PHP" , "Exp : 1 years"),
            Language("CPP" , "Exp : 8 years"),
        )
    }


    }
