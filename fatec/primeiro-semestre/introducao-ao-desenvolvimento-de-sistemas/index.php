<?php

$average = $argc[0];

if ($average >= 0 and $average <=10){
    if ($average > 5){
        echo "Aprovado";
    } else if ($average < 3){
        echo "Reprovado";
    } else {
        echo "Exame";
    }
} else {
    echo "Media invalida";
}