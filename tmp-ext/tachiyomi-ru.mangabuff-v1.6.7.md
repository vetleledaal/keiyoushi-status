# Extension Validation Report

- Extension: tachiyomi-ru.mangabuff-v1.6.7
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 34
- Lint: 1
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4008409601887986192
- Source name: MangaBuff
- Source language: ru
- Selected manga input: latest offset 0: Бог смерти (`.../bog-smerti`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Слезы на увядших цветах (`.../slezy-na-uvyadshih-cvetah`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 30 | Пик боевых искусств (`.../pik-boevyh-iskusstv`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Бог смерти (`.../bog-smerti`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Месть сына Якудзы (`.../organizaciya-kampusa`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 4 | Добрый бог смерти (`.../dobryi-bog-smerti`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Бог смерти (`.../bog-smerti`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 145 | Том 1 Глава 0  (`.../0`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 9 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 1: title=Бог смерти, URL=`.../bog-smerti` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 124/124 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 124/124 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangabuff.ru/.../bog-smerti.jpg` (image/jpeg, 246876 bytes, 690x1000) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../bog-smerti` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mangabuff.ru/.../bog-smerti.jpg <redacted query values: 1788051355>` (image/jpeg, 246876 bytes, 690x1000) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Манхва, 2022, Экшен, Боевые искусства, История, Мурим, Медицина, Военные, Ниндзя, Самураи, Выживание, Боги, Алхимия, Армия, Артефакты, Бои на мечах, Борьба за власть, Война, ГГ мужчина, Дружба, Жестокий мир, Месть, Навыки / способности, Наёмники, Насилие / жестокость, Скрытие личности |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Молодой мужчина по имени Джонгли Чу живет в мире, где балом правят религиозные секты, поклоняющиеся разнообразным божествам и даже смерти. Один из фанатиков расправился со старшим братом главного героя. Последний нарушил правила собственной организации дабы отомстить и попал в опалу. Будучи не в состоянии в одиночку противостоять многочисленным недоброжелателям, Джонгли отчаянно нуждается в союзниках. Потому он заключает сделку с "Багровым Убийцей" из Агентства Душ, вследствие чего втягивается в еще более опасную авантюру, названную "Уничтожение". Лишь отменные боевые навыки и толика везения удерживают Чу в мире живых. Постепенно все более явственно ощущается дыхание погибели. Главный герой идет на рискованные шаги, выступая против правил ортодоксальных сект.<br><br>Рейтинг: 89%<br><br>Просмотров: 1 231 971<br><br>Избранное: 927<br><br>Альтернативные названия:<br>• Death God<br>• 死神 (Lim Jae Won & Seol Bong) 사신 |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 1 name, chapter 2 name, chapter 3 name, chapter 4 name, chapter 5 name, chapter 6 name, chapter 7 name, chapter 8 name, chapter 9 name, chapter 10 name, chapter 11 name, chapter 12 name, chapter 13 name, chapter 14 name, chapter 15 name, chapter 16 name, chapter 17 name, chapter 18 name, chapter 19 name, chapter 20 name, chapter 21 name, chapter 22 name, chapter 23 name, chapter 24 name, chapter 25 name, chapter 26 name, chapter 27 name, chapter 28 name, chapter 29 name, chapter 30 name, chapter 31 name, chapter 32 name, chapter 33 name, chapter 34 name, chapter 35 name, chapter 36 name, chapter 37 name, chapter 38 name, chapter 39 name, chapter 40 name, chapter 41 name, chapter 42 name, chapter 43 name, chapter 44 name, chapter 45 name, chapter 46 name, chapter 47 name, chapter 48 name, chapter 49 name, chapter 50 name, chapter 51 name, chapter 52 name, chapter 53 name, chapter 54 name, chapter 55 name, chapter 56 name, chapter 57 name, chapter 58 name, chapter 59 name, chapter 60 name, chapter 61 name, chapter 62 name, chapter 63 name, chapter 64 name, chapter 65 name, chapter 66 name, chapter 67 name, chapter 68 name, chapter 69 name, chapter 70 name, chapter 71 name, chapter 72 name, chapter 73 name, chapter 74 name, chapter 75 name, chapter 76 name, chapter 77 name, chapter 78 name, chapter 79 name, chapter 80 name, chapter 81 name, chapter 82 name, chapter 83 name, chapter 84 name, chapter 85 name, chapter 86 name, chapter 87 name, chapter 88 name, chapter 89 name, chapter 90 name, chapter 91 name, chapter 92 name, chapter 93 name, chapter 94 name, chapter 95 name, chapter 96 name, chapter 97 name, chapter 98 name, chapter 99 name, chapter 100 name, chapter 101 name, chapter 102 name, chapter 103 name, chapter 104 name, chapter 105 name, chapter 106 name, chapter 107 name, chapter 108 name, chapter 109 name, chapter 110 name, chapter 111 name, chapter 112 name, chapter 113 name, chapter 114 name, chapter 115 name, chapter 116 name, chapter 117 name, chapter 118 name, chapter 119 name, chapter 120 name, chapter 121 name, chapter 122 name, chapter 123 name, chapter 124 name, chapter 125 name, chapter 126 name, chapter 127 name, chapter 128 name, chapter 129 name, chapter 130 name, chapter 131 name, chapter 132 name, chapter 133 name, chapter 134 name, chapter 135 name, chapter 136 name, chapter 137 name, chapter 138 name, chapter 139 name, chapter 140 name, chapter 141 name, chapter 142 name, chapter 143 name, chapter 144 name, chapter 145 name |  |  |  |
| chapters | PASS | 145 chapters |  |  |  |
| chapter dates | PASS | 145 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://c3.mangabuff.ru/.../1.jpg` (image/jpeg, 1143491 bytes, 687x14576) |  |  |  |
