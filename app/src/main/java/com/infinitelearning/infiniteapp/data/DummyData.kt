package com.infinitelearning.infiniteapp.data

import com.infinitelearning.infiniteapp.R
import com.infinitelearning.infiniteapp.model.Course
import com.infinitelearning.infiniteapp.model.Gallery
import com.infinitelearning.infiniteapp.model.Mentee
import com.infinitelearning.infiniteapp.model.Mentor

object DummyData {
    val mobileMentors = listOf(
        Mentor(
            id = 1,
            name = "Ikmal Jaka",
            nickname = "ikmal",
            role = "Technical Mobile",
            photo = R.drawable.ikmal
        ),
        Mentor(
            id = 2,
            name = "Saputra Arya",
            nickname = "saputra",
            role = "Technical Mobile",
            photo = R.drawable.saputra
        ),
        Mentor(
            id = 3,
            name = "Joko Tingkir",
            nickname = "joko",
            role = "Technical Mobile",
            photo = R.drawable.joko
        ),
        Mentor(
            id = 4,
            name = "Khairul Adandi",
            nickname = "khairul",
            role = "Technical Mobile",
            photo = R.drawable.khairul
        ),
        Mentor(
            id = 5,
            name = "Rajanya Cinderela",
            nickname = "raja",
            role = "Technical Mobile",
            photo = R.drawable.raja,
        )
    )

    val mobileMentees = listOf(
        Mentee(
            id = 1,
            name = "BUNG ANIES",
            photo = R.drawable.anis,
            batch = "2024",
            role = "KANCE LAME",
        ),
        Mentee(
            id = 2,
            name = "BUK MEGA",
            photo = R.drawable.bumega,
            batch = "2024",
            role = "CE ES",
        ),
        Mentee(
            id = 3,
            name = "PAK KETUM PSSI",
            photo = R.drawable.eriktho,
            batch = "2024",
            role = "KAWAN NGOPI",
        ),
        Mentee(
            id = 4,
            name = "KANG GANJAR",
            photo = R.drawable.ganjarpak,
            batch = "2024",
            role = "SAT SET",
        ),
        Mentee(
            id = 5,
            name = "PAK PRESIDEN",
            photo = R.drawable.gemoy,
            batch = "2024",
            role = "OTW PERUBAHAN",
        ),
        Mentee(
            id = 6,
            name = "PAK HERMAN DERU GUB",
            photo = R.drawable.hermanderu,
            batch = "2024",
            role = "BACALON GUB SUMSEL",
        ),
        Mentee(
            id = 7,
            name = "SESE KIM JONG UN",
            photo = R.drawable.kimjong,
            batch = "2024",
            role = "KAWAN BUAT BOM",
        ),
        Mentee(
            id = 8,
            name = "BUNG MAHFUD",
            photo = R.drawable.mahfud,
            batch = "2024",
            role = "SAT SET 2",
        ),
        Mentee(
            id = 9,
            name = "MAS GIBRAN ",
            photo = R.drawable.masgibran,
            batch = "2024",
            role = "MUDA BERKARYA",
        ),
        Mentee(
            id = 10,
            name = "PAKDE JOKOWI",
            photo = R.drawable.pakjokowi,
            batch = "2024",
            role = "PRESIDEN 2 PERIODE",
        ),
        Mentee(
            id = 11,
            name = "KANG PUTIN",
            photo = R.drawable.putin,
            batch = "2024",
            role = "KANCE GEMPUR UKR",
        )
    )

    val mobileCourses = listOf(
        Course(
            id = 1,
            name = "Ucapan isra mi'raj",
            level = "PHBI",
            photo = R.drawable.ucapan_kamu
        ),
        Course(
            id = 2,
            name = "Ucapan isra mi'raj bakso",
            level = "PHBI",
            photo = R.drawable.ucapan_kamu2
        ),
        Course(
            id = 3,
            name = "Menu Makanan AKB",
            level = "All customer",
            photo = R.drawable.ucapan_kamu6
        ),
        Course(
            id = 4,
            name = "AKB event organizer",
            level = "ALL customer",
            photo = R.drawable.ucapan_kamu4
        ),
        Course(
            id = 5,
            name = "AKB event organizer",
            level = "ALL customer",
            photo = R.drawable.ucapan_kamu4
        ),
        Course(
            id = 6,
            name = "Menu Makanan AKB",
            level = "All customer",
            photo = R.drawable.ucapan_kamu6
        ),
        Course(
            id = 7,
            name = "Menu Makanan AKB",
            level = "All customer",
            photo = R.drawable.ucapan_kamu7
        ),
        Course(
            id = 8,
            name = "Background menu makanan AKB",
            level = "ALL customer",
            photo = R.drawable.ucapan_kamu8
        )
    )

    val infiniteGalleries = listOf(
        Gallery(
            id = 1,
            name = "Digital Marketing",
            photo = R.drawable.digital_marketing
        ),
        Gallery(
            id = 2,
            name = "Menjadi Designer",
            photo = R.drawable.designer
        ),
        Gallery(
            id = 3,
            name = "Modern Android in 2024",
            photo = R.drawable.modern_android
        ),
        Gallery(
            id = 4,
            name = "Iftar Inners",
            photo = R.drawable.iftar
        ),
        Gallery(
            id = 5,
            name = "Container Technology",
            photo = R.drawable.container_technologi
        ),
        Gallery(
            id = 6,
            name = "Filosofi Ilo",
            photo = R.drawable.filosofi_ilo
        ),
        Gallery(
            id = 7,
            name = "Tips Lulus MSIB",
            photo = R.drawable.lulus_msib
        ),
        Gallery(
            id = 8,
            name = "Fresh Graduate jadi Manager",
            photo = R.drawable.manager
        ),
        Gallery(
            id = 9,
            name = "Kenapa IBM Academy?",
            photo = R.drawable.ibm_academy
        ),
        Gallery(
            id = 10,
            name = "Unreal Engine",
            photo = R.drawable.unreal_engine
        ),
        Gallery(
            id = 11,
            name = "Masih Stuck di Chat GPT?",
            photo = R.drawable.stuck_chatgpt
        ),
    )
}