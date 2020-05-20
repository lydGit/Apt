package com.lydgit.apt;

import androidx.lifecycle.MutableLiveData;

import com.lydgit.annotation.Repeater;
import com.lydgit.annotation.RepeaterField;

@Repeater
public class Name {

    @RepeaterField(name = "setName")
    public MutableLiveData<String> name = new MutableLiveData<>();

}
