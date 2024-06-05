package ru.rsue.kornienko.bookdepository2;


import androidx.fragment.app.Fragment;


public class MainActivity extends SingleFragmentActivity {

    @Override
    protected  Fragment createFragment(){
        return new BookFragment();
    }
}
