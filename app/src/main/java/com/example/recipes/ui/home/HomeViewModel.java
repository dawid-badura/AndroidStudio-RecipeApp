package com.example.recipes.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;


    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Gotowanie to świetna recepta na monotonię. Szczególnie wtedy, jeśli zamiast powielać znane, będziemy wypróbowywać nowe przepisy. Gdzie ich szukać? Oczywiście u nas! Znajdziesz tu zarówno proste receptury w sam raz dla tych, którzy stawiają pierwsze kroki w kuchni, jak i bardziej złożone przepisy dla doświadczonych kucharzy.");


    }

    public LiveData<String> getText() {
        return mText;
    }
}