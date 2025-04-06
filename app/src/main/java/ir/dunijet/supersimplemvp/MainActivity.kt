package ir.dunijet.supersimplemvp

import Contract.MainContract
import Presenter.MainPresenter
import Model.dataMain
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import ir.dunijet.supersimplemvp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() , MainContract.View {
    lateinit var binding :ActivityMainBinding
    lateinit var presenter :MainContract.Presenter
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(binding.root)

        presenter = MainPresenter()
        presenter.onAttach(this)




    }

    override fun showStudentData(data: List<dataMain>) {
        binding.txtMain.text = data.toString()
    }
}