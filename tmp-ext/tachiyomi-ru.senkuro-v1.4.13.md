# Extension Validation Report

- Extension: tachiyomi-ru.senkuro-v1.4.13
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 30
- Lint: 1
- Warnings: 0
- Skipped: 5
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1452500215874655811
- Source name: Senkuro
- Source language: ru
- Selected manga input: popular offset 0: Владыка лука и клинка (`.../TUFOR0E6MjQ2ODQ2NzUzNDc3NzcyODI3,,bowblade-spirit`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Владыка лука и клинка (`.../TUFOR0E6MjQ2ODQ2NzUzNDc3NzcyODI3,,bowblade-spirit`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 10 | Обретя абсолютную мощь, я растопчу всех, кто встанет у меня на пути (`.../TUFOR0E6MjQ1ODgwMDYyNjU2NjYxMDIw,,hazure-skill-mugen-saisei-ga-kakusei-shite-sekai-saikyou-ni-natta-saikyou-no-chikara-wo-te-ni-shita-ore-wa-tekitai-suru-sono-subete-wo-juurin-suru`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | skipped | 0 |  |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 10 | Владыка лука и клинка (`.../TUFOR0E6MjQ2ODQ2NzUzNDc3NzcyODI3,,bowblade-spirit`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Владыка лука и клинка (`.../TUFOR0E6MjQ2ODQ2NzUzNDc3NzcyODI3,,bowblade-spirit`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 196 | 1. Глава 1  (`.../TUFOR0E6MjQ2ODQ2NzUzNDc3NzcyODI3,,bowblade-spirit,,TUFOR0FfQ0hBUFRFUjoyNDY4NTQ4NTYxNTE2ODA1MTM,,246854856151680513`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 10 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | SKIP | supportsLatest = false |  |  |  |
| latest_next operation | SKIP | supportsLatest = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | SKIP | supportsLatest = false |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Владыка лука и клинка, URL=`TUFOR0E6MjQ2ODQ2NzUzNDc3NzcyODI3,,bowblade-spirit` |  |  |  |
| latest differs from popular | SKIP | supportsLatest = false |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | supportsLatest = false |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 30/30 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 30/30 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mirai.senkuro.net/.../dd97112d52e258c1bec1630e5875af02de2bfdad_246848091779515954.jpeg` (image/jpeg, 187678 bytes, 700x1000) |  |  |  |
| details identity | PASS | Details preserved selected URL `TUFOR0E6MjQ2ODQ2NzUzNDc3NzcyODI3,,bowblade-spirit` |  |  |  |
| details thumbnail URL | PASS | `https://mirai.senkuro.net/.../dd97112d52e258c1bec1630e5875af02de2bfdad_246848091779515954.jpeg` |  |  |  |
| details author | PASS | Donhyung Cho |  |  |  |
| details artist | PASS | Gwangjin Park |  |  |  |
| details genres | PASS | Манхва, 16+, Веб, Вебтун, В цвете, Фэнтези, Экшен, Боевые искусства, Приключения, Культивация, Выживание, ГГ мужчина, Жестокий мир, Месть, Навыки / Способности, Насилие / Жестокость, Сокрытие личности, Спасение мира, Учитель, ГГ имба, Умный ГГ, Бои на мечах, Сёнен, Фэнтезийный мир, Трагедия |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Альтернативные названия:<br>Lord of the Bow and Blade / Gunggwi Geomsin 1-bu / Мастер меча дворца / Луком стреляет как мастер, а мечом владеет как Бог / 궁귀검신 / Gunggwigeomsin / 弓鬼劍神弓鬼劍神<br><br>Лук - это оружие, способное убить не только того, кто стоит на видном месте, но и воина, запрятавшегося в гуще событий. Только представьте, как в вас целится орудие, которого не видно. Черт, да что вообще может быть страшнее?ᅠИ так, наше приключение… начинается.. История великого труженика… история... о путешествии в поисках женщины, назначенной ему судьбой. О герое... о воине, что пройдет грандиозный путь… во имя добра и справедливости. Это сказ о непобедимом… властелине лука и меча.ᅠЛетящая стрела укажет путь, я буду следовать за ней, покуда не взойду… на Олимп славы! © Senkuro |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 1 name, chapter 2 name, chapter 3 name, chapter 4 name, chapter 5 name, chapter 6 name, chapter 7 name, chapter 8 name, chapter 9 name, chapter 10 name, chapter 11 name, chapter 12 name, chapter 13 name, chapter 14 name, chapter 15 name, chapter 16 name, chapter 17 name, chapter 18 name, chapter 19 name, chapter 20 name, chapter 21 name, chapter 22 name, chapter 23 name, chapter 24 name, chapter 25 name, chapter 26 name, chapter 27 name, chapter 28 name, chapter 29 name, chapter 30 name, chapter 31 name, chapter 32 name, chapter 33 name, chapter 34 name, chapter 35 name, chapter 36 name, chapter 37 name, chapter 38 name, chapter 39 name, chapter 40 name, chapter 41 name, chapter 42 name, chapter 43 name, chapter 44 name, chapter 45 name, chapter 46 name, chapter 47 name, chapter 48 name, chapter 59 name, chapter 60 name, chapter 61 name, chapter 62 name, chapter 63 name, chapter 64 name, chapter 65 name, chapter 66 name, chapter 67 name, chapter 68 name, chapter 69 name, chapter 70 name, chapter 71 name, chapter 72 name, chapter 73 name, chapter 74 name, chapter 75 name, chapter 76 name, chapter 77 name, chapter 78 name, chapter 79 name, chapter 80 name, chapter 81 name, chapter 82 name, chapter 83 name, chapter 84 name, chapter 85 name, chapter 86 name, chapter 87 name, chapter 88 name, chapter 89 name, chapter 90 name, chapter 91 name, chapter 92 name, chapter 93 name, chapter 94 name, chapter 95 name, chapter 96 name, chapter 97 name, chapter 98 name, chapter 99 name, chapter 100 name, chapter 101 name, chapter 102 name, chapter 103 name, chapter 104 name, chapter 105 name, chapter 106 name, chapter 107 name, chapter 108 name, chapter 109 name, chapter 110 name, chapter 111 name, chapter 112 name, chapter 113 name, chapter 114 name, chapter 115 name, chapter 116 name, chapter 117 name, chapter 118 name, chapter 119 name, chapter 120 name, chapter 121 name, chapter 122 name, chapter 123 name, chapter 124 name, chapter 125 name, chapter 126 name, chapter 127 name, chapter 128 name, chapter 129 name, chapter 130 name, chapter 131 name, chapter 132 name, chapter 133 name, chapter 134 name, chapter 135 name, chapter 136 name, chapter 137 name, chapter 138 name, chapter 139 name, chapter 140 name, chapter 141 name, chapter 142 name, chapter 143 name, chapter 144 name, chapter 145 name, chapter 146 name, chapter 147 name, chapter 148 name, chapter 149 name, chapter 150 name, chapter 151 name, chapter 152 name, chapter 153 name, chapter 154 name, chapter 155 name, chapter 156 name, chapter 157 name, chapter 158 name, chapter 159 name, chapter 160 name, chapter 161 name, chapter 162 name, chapter 163 name, chapter 164 name, chapter 165 name, chapter 166 name, chapter 167 name, chapter 168 name, chapter 169 name, chapter 170 name, chapter 171 name, chapter 172 name, chapter 173 name, chapter 174 name, chapter 175 name, chapter 176 name, chapter 177 name, chapter 178 name, chapter 179 name, chapter 180 name, chapter 181 name, chapter 182 name, chapter 183 name, chapter 184 name, chapter 185 name, chapter 186 name, chapter 187 name, chapter 188 name, chapter 189 name, chapter 190 name, chapter 191 name, chapter 192 name, chapter 193 name, chapter 194 name, chapter 195 name, chapter 196 name |  |  |  |
| chapters | PASS | 196 chapters |  |  |  |
| chapter dates | PASS | 196 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://mirai.senkuro.net/.../tachiyomi-op.jpeg` (image/jpeg, 343802 bytes, 1000x1200) |  |  |  |
