package com.jojeda.characterbuilder;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import static com.jojeda.characterbuilder.Recursos.DEXTERITY;
import static com.jojeda.characterbuilder.Recursos.STRENGTH;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LayoutInflater inflater = LayoutInflater.from(this);

        LinearLayout layout = findViewById(R.id.layout);

        // Fuerza

        // Recorrer las caracteristicas
        for (Characteristic characteristic : Recursos.characteristics.values()) {

            View characteristicView = inflater.inflate(R.layout.characteristic_layout, null);
            TextView modifierTV = characteristicView.findViewById(R.id.tvModifier);
            EditText scoreET = characteristicView.findViewById(R.id.etScore);
            LinearLayout skillsContainer = characteristicView.findViewById(R.id.skillContainer);

            scoreET.setText(String.valueOf(characteristic.getScore()));
            modifierTV.setText(String.valueOf(characteristic.getModifier()));

            // Para cada skill, pintarla
            for (Skill skill : characteristic.getSkills()) {
                View skillView = inflater.inflate(R.layout.skill_layout, null);

                TextView tvName = skillView.findViewById(R.id.tvName);
                CheckBox cbProficient = skillView.findViewById(R.id.cbProficient);
                CheckBox cbExpert = skillView.findViewById(R.id.cbExpert);

                tvName.setText(skill.getName());
                cbProficient.setSelected(skill.isProficient());
                cbExpert.setSelected(skill.isExpert());

                skillsContainer.addView(skillView);
            }

            // Añadir la caracteristica
            layout.addView(characteristicView);
        }






//        View item = inflater.inflate(R.layout.caracteristicas, null);
//        TextView texto = item.findViewById(R.id.)
//
//        LinearLayout layout = findViewById(R.id.layout);
//
//        layout.addView(item);
//
//        TextView tvHabilidad = new TextView(this);
//        tvHabilidad.setText("Fuerza");
//        layout.addView(tvHabilidad);
//
//        tvHabilidad = new TextView(this);
//        tvHabilidad.setText("Debilidad");
//        layout.addView(tvHabilidad);

    }
}
