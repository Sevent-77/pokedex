package com.example.pokedex;

import java.util.ArrayList;

public class PokemonData {

    public static ArrayList<Pokemon> getPokemons() {

        ArrayList<Pokemon> pokemons = new ArrayList<>();

        pokemons.add(new Pokemon(
                "Bulbasaur",
                "Planta / Veneno",
                "Possui uma semente plantada em suas costas desde o nascimento.",
                "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/1.png"
        ));

        pokemons.add(new Pokemon(
                "Ivysaur",
                "Planta / Veneno",
                "A semente em suas costas cresce e começa a florescer.",
                "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/2.png"
        ));

        pokemons.add(new Pokemon(
                "Venusaur",
                "Planta / Veneno",
                "Possui uma grande flor nas costas que absorve energia solar.",
                "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/3.png"
        ));

        pokemons.add(new Pokemon(
                "Charmander",
                "Fogo",
                "A chama na ponta de sua cauda indica sua condição de saúde.",
                "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/4.png"
        ));

        pokemons.add(new Pokemon(
                "Charmeleon",
                "Fogo",
                "Utiliza suas garras afiadas e sua cauda flamejante em batalhas.",
                "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/5.png"
        ));

        pokemons.add(new Pokemon(
                "Charizard",
                "Fogo / Voador",
                "Um poderoso Pokémon capaz de voar e lançar intensas rajadas de fogo.",
                "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/6.png"
        ));

        pokemons.add(new Pokemon(
                "Squirtle",
                "Água",
                "Utiliza seu casco para proteção e lança água contra seus adversários.",
                "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/7.png"
        ));

        pokemons.add(new Pokemon(
                "Wartortle",
                "Água",
                "Possui uma cauda longa e utiliza seu casco resistente para defesa.",
                "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/8.png"
        ));

        pokemons.add(new Pokemon(
                "Blastoise",
                "Água",
                "Possui poderosos canhões de água localizados em seu casco.",
                "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/9.png"
        ));

        pokemons.add(new Pokemon(
                "Caterpie",
                "Inseto",
                "Um pequeno Pokémon que utiliza suas antenas para afastar predadores.",
                "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/10.png"
        ));

        pokemons.add(new Pokemon(
                "Metapod",
                "Inseto",
                "Seu corpo é protegido por uma casca resistente enquanto evolui.",
                "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/11.png"
        ));

        pokemons.add(new Pokemon(
                "Butterfree",
                "Inseto / Voador",
                "Suas asas liberam um pó fino que pode afetar seus adversários.",
                "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/12.png"
        ));

        pokemons.add(new Pokemon(
                "Weedle",
                "Inseto / Veneno",
                "Possui um ferrão venenoso no topo da cabeça para se defender.",
                "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/13.png"
        ));

        pokemons.add(new Pokemon(
                "Kakuna",
                "Inseto / Veneno",
                "Permanece praticamente imóvel enquanto seu corpo se prepara para evoluir.",
                "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/14.png"
        ));

        pokemons.add(new Pokemon(
                "Beedrill",
                "Inseto / Veneno",
                "Possui grandes ferrões e pode voar rapidamente para atacar.",
                "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/15.png"
        ));

        pokemons.add(new Pokemon(
                "Pidgey",
                "Normal / Voador",
                "Um Pokémon tranquilo que utiliza suas asas para levantar poeira.",
                "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/16.png"
        ));

        pokemons.add(new Pokemon(
                "Pidgeotto",
                "Normal / Voador",
                "Defende seu território e possui excelente capacidade de voo.",
                "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/17.png"
        ));

        pokemons.add(new Pokemon(
                "Pidgeot",
                "Normal / Voador",
                "Possui grande velocidade de voo e excelente visão.",
                "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/18.png"
        ));

        pokemons.add(new Pokemon(
                "Rattata",
                "Normal",
                "Um pequeno Pokémon roedor conhecido por sua agilidade.",
                "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/19.png"
        ));

        pokemons.add(new Pokemon(
                "Pikachu",
                "Elétrico",
                "Armazena eletricidade em suas bochechas e pode liberá-la em ataques.",
                "https://raw.githubusercontent.com/PokeAPI/sprites/master/sprites/pokemon/25.png"
        ));

        return pokemons;
    }
}
