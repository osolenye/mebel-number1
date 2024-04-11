package com.example.pp_furniture.ui.dashboard;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import com.example.pp_furniture.MAdapter;
import com.example.pp_furniture.R;
import com.example.pp_furniture.databinding.FragmentBedRoomBinding;
import com.example.pp_furniture.models.FurnitureModel;

import java.util.ArrayList;
import java.util.List;


public class BedRoomFragment extends Fragment {
    private FragmentBedRoomBinding binding;
    List<FurnitureModel> list_bedroom = new ArrayList<>();
    MAdapter adapter;
    NavController navController;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentBedRoomBinding.inflate(inflater, container, false);
        View root = binding.getRoot();
        createList();
        adapter = new MAdapter();
        adapter.setList_m(list_bedroom);
        binding.rvBedRoom.setAdapter(adapter);
        return root;
    }

    private void createList() {
//        list_bedroom.add(new FurnitureModel("bed_room","Кровать Red Flame", "1690",
//                "Кровать двухспальная размер 2.6м х 2.4м производство Турция," +
//                        " матрас набивной пружинный, кокосовая стружка", R.drawable.bad_red_flame));
//        list_bedroom.add(new FurnitureModel("bed_room","Кровать Red_sunrise", "1100",
//                " производство Италия, размер 2.6м х 2.4м" + " Mario Fabric " + "отделка: натуральнаая кожа  и гобелен," +
//                        "набивной, специальный состав"
//                , R.drawable.bed_parlament));
//        list_bedroom.add(new FurnitureModel("bed_room","Кровать Plot", "1340",
//                " производство Италия, размер 2.2м х 2.15м" + " Riotello " + "отделка: хлопок и гобелен," +
//                        "набивной, специальный состав"
//                , R.drawable.bed_super_stable));
//        list_bedroom.add(new FurnitureModel("bed_room","Кровать Parlament", "1200",
//                " производство Италия, размер 2.2м х 2.4м" + "Mario Fabric " + "отделка: хлопок и атлас," +
//                        "набивной, специальный состав"
//                , R.drawable.bad_red_flame));
//        list_bedroom.add(new FurnitureModel("bed_room","Кровать Red Flame", "1690",
//                "Кровать двухспальная размер 2.6м х 2.4м производство Турция," +
//                        " матрас набивной пружинный, кокосовая стружка", R.drawable.bad_red_flame));
//        list_bedroom.add(new FurnitureModel("bed_room","Кровать Red_sunrise", "1100",
//                " производство Италия, размер 2.6м х 2.4м" + " Mario Fabric " + "отделка: натуральнаая кожа  и гобелен," +
//                        "набивной, специальный состав"
//                , R.drawable.bed_parlament));
//        list_bedroom.add(new FurnitureModel("bed_room","Кровать Plot", "1340",
//                " производство Италия, размер 2.2м х 2.15м" + " Riotello " + "отделка: хлопок и гобелен," +
//                        "набивной, специальный состав"
//                , R.drawable.bed_super_stable));
//        list_bedroom.add(new FurnitureModel("bed_room","Кровать Parlament", "1200",
//                " производство Италия, размер 2.2м х 2.4м" + "Mario Fabric " + "отделка: хлопок и атлас," +
//                        "набивной, специальный состав"
//                , R.drawable.bad_red_flame));

        list_bedroom.add(new FurnitureModel("bed_room", "Кровать Сияющая Заря", "1550",
                "Кровать из массива дуба с высококачественной тканью, размер 2.0м х 2.2м, производство Япония. " +
                        "Эргономичный дизайн и уникальная система вентиляции матраса.", R.drawable.bed_shining_dawn));
        list_bedroom.add(new FurnitureModel("bed_room", "Кровать Лунное Озеро", "1850",
                "Кровать из натурального ореха с эксклюзивной кожей, размер 2.5м х 2.3м, производство Швейцария. " +
                        "Встроенная подсветка и система антистрессового массажа.", R.drawable.bed_moon_lake));
        list_bedroom.add(new FurnitureModel("bed_room", "Кровать Зенитный Свет", "1450",
                "Кровать из массива бука с натуральным леном, размер 2.4м х 2.1м, производство Германия. " +
                        "Система управления комфортом через мобильное приложение.", R.drawable.bed_zenith_light));
        list_bedroom.add(new FurnitureModel("bed_room", "Кровать Императорский Покой", "2500",
                "Кровать из резного дуба с роскошным бархатом, размер 2.8м х 2.5м, производство Франция. " +
                        "Элегантный дизайн с ручной резьбой и встроенные ящики для белья.", R.drawable.bed_imperial_rest));
        list_bedroom.add(new FurnitureModel("bed_room", "Кровать Волшебный Сон", "1690",
                "Кровать из массива красного дуба с мягкой тканью, размер 2.2м х 2.0м, производство Голландия. " +
                        "Интегрированная система релаксации с ароматическими диффузорами.", R.drawable.bed_magic_dream));
        list_bedroom.add(new FurnitureModel("bed_room", "Кровать Роскошный Отдых", "1950",
                "Кровать из массива вишневого дерева с роскошной шелковой обивкой, размер 2.6м х 2.3м, производство Испания. " +
                        "Ручная роспись элементов и встроенная система массажа.", R.drawable.bed_luxurious_rest));
        list_bedroom.add(new FurnitureModel("bed_room", "Кровать Сказочный Этаж", "1780",
                "Кровать из массива ясеня с декоративной тканью, размер 2.4м х 2.2м, производство США. " +
                        "Уникальный дизайн в стиле ретро и встроенная подсветка.", R.drawable.bed_fairy_floor));
        list_bedroom.add(new FurnitureModel("bed_room", "Кровать Звездный Сон", "2100",
                "Кровать из массива ольхи с мягким бархатом, размер 2.8м х 2.5м, производство Швеция. " +
                        "Встроенная система звукового сна и регулируемая подсветка.", R.drawable.bed_star_sleep));

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        binding.btnBack.setOnClickListener(v->{
            navController = Navigation.findNavController(requireActivity(),
                    R.id.nav_host_fragment_activity_main);
            navController.navigate(R.id.action_navigation_bed_room_to_navigation_home);
        });
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}