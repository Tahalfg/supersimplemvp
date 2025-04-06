package Presenter

import Contract.MainContract
import Model.MainRepository

class MainPresenter : MainContract.Presenter {

    override fun onAttach(view: MainContract.View) {
       val mainView = view
        mainView.showStudentData(MainRepository().getStudentData())
    }

    override fun onDetach() {
    }


}