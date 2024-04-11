package com.example.pp_furniture.ui.garden;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pp_furniture.MAdapter;
import com.example.pp_furniture.R;
import com.example.pp_furniture.databinding.FragmentGardenBinding;
import com.example.pp_furniture.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;

public class GardenFragment extends Fragment {

    FragmentGardenBinding binding;
    NavController navController;
    List<FurnitureModel> list_g = new ArrayList<>();
    MAdapter adapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      binding = FragmentGardenBinding
              .inflate(inflater,container,false);
      View root = binding.getRoot();
      createList();
      adapter = new MAdapter();
      adapter.setList_m(list_g);
      binding.rvGarden.setAdapter(adapter);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_gardenFragment_to_navigation_home);

        });

    }
    public void createList(){
        list_g.add(new FurnitureModel("Садовая мебель", "Комплект 'Летняя Роскошь': стол и стулья", "980",
                "Превратите свой сад в оазис роскоши с этим элегантным комплектом стола и стульев. " +
                        "Изготовленный из прочного ротанга, этот комплект обеспечит комфорт и стиль вашему отдыху на свежем воздухе.", "40%", R.drawable.table_and_stules));
        list_g.add(new FurnitureModel("Садовая мебель", "Складные стулья 'Уютный уголок'", "380",
                "Эти складные стулья - идеальное решение для создания уютного уголка в вашем саду или на террасе. " +
                        "Легкие и компактные, они легко хранятся и переносятся, обеспечивая удобство и функциональность.", "60%", R.drawable.folded_seats));
        list_g.add(new FurnitureModel("Садовая мебель", "Качели 'Летний Бриз'", "580",
                "Расслабьтесь и наслаждайтесь прохладным летним бризом на этих удобных качелях. " +
                        "Изготовленные из высококачественного ротанга, они обеспечат вам максимальный комфорт и удовольствие от отдыха на свежем воздухе.", "50%", R.drawable.kach));
        list_g.add(new FurnitureModel("Садовая мебель", "Стол 'Пикник в Саду'", "450",
                "Этот стол идеально подходит для организации пикника или вечеринки на свежем воздухе. " +
                        "Компактный и прочный, он обеспечит удобство и функциональность во время отдыха с друзьями и семьей.", "55%", R.drawable.picnic_table));
        list_g.add(new FurnitureModel("Садовая мебель", "Шезлонг 'Солнечный День'", "750",
                "Расслабьтесь на этом уютном шезлонге и наслаждайтесь солнечным днем в вашем саду. " +
                        "Изготовленный из прочного ротангового дерева, он обеспечит вам комфорт и релаксацию под открытым небом.", "45%", R.drawable.shezlong));

    }
}