# Extension Validation Report

- Extension: tachiyomi-uk.faust-v1.6.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4199586547771751025
- Source name: Faust
- Source language: uk
- Selected manga input: popular offset 0: Цього разу я володарка свого життя (`.../tsoho-razu-ia-volodarka-svoho-zhyttia`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 12 | Цього разу я володарка свого життя (`.../tsoho-razu-ia-volodarka-svoho-zhyttia`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 12 | Jinx (`.../jinx`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 12 | Між долею і фортуною (`.../mizh-doleiu-i-fortunoiu`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 12 | Лиходію, я готова на все, окрім заміжжя! (`.../lykhodiiu-ia-hotova-na-vse-okrim-zamizhzhia`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Цього разу я володарка свого життя (`.../tsoho-razu-ia-volodarka-svoho-zhyttia`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Цього разу я володарка свого життя (`.../tsoho-razu-ia-volodarka-svoho-zhyttia`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 216 | Том 1 Розділ 0  (`.../tsoho-razu-ia-volodarka-svoho-zhyttia`) |  | <1s |
| pages | `getPageList(chapter)` | success | 8 |  |  | <1s |

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
| popular listing | PASS | 12 entries |  |  |  |
| latest listing | PASS | 12 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Цього разу я володарка свого життя, URL=`tsoho-razu-ia-volodarka-svoho-zhyttia` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 49/49 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 49/49 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.faust-web.com/.../cover_6eca330bef41429cbebec95cded1929a.jpg` (image/jpeg, 263421 bytes, 559x800) |  |  |  |
| details identity | PASS | Details preserved selected URL `tsoho-razu-ia-volodarka-svoho-zhyttia` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.faust-web.com/.../cover_6eca330bef41429cbebec95cded1929a.jpg` |  |  |  |
| details author | PASS | Kim Roa |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 0+, Манхва, Романтика, Історія, Ісекай, Комедія |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Відтоді як Фірентія народилася, родина Ломбарді відкидала її через те, що вона була позашлюбною дитиною. Ніхто не піклувався про неї після смерті батька, але вона все ще доглядала за маєтком через любов до імені Ломбарді. Але, незважаючи на її важку працю, її вигнали з садиби жадібні дядьки, які всього через два роки довели сім'ю до краху. Коли Фірентія сама потрапила в аварію, вона думала, що це кінець цього жалюгідного існування. Вона навіть не підозрювала, що вона відправиться на 20 років назад у минуле! Тепер, озброївшись знаннями про майбутнє, Фірентія вирішує стати головою сім’ї, рятуючи своїх близьких, збираючи могутніх союзників і перешкоджаючи своїм злим дядькам і двоюрідним братам у цьому процесі. Завдання може бути складним, але якщо хтось і може стати новим матріархом Ломбарді, то це вона!<br><br>Альтернативні назви: I Shall Master this Family<br>Рейтинг: 4.97/5 (61), В закладках: 377 |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 1 scanlator, chapter 2 scanlator, chapter 3 scanlator, chapter 4 scanlator, chapter 5 scanlator, chapter 6 scanlator, chapter 7 scanlator, chapter 8 scanlator, chapter 9 scanlator, chapter 10 scanlator, chapter 11 name, chapter 11 scanlator, chapter 12 scanlator, chapter 13 name, chapter 13 scanlator, chapter 14 name, chapter 14 scanlator, chapter 15 name, chapter 15 scanlator, chapter 16 name, chapter 16 scanlator, chapter 17 name, chapter 17 scanlator, chapter 18 name, chapter 18 scanlator, chapter 19 name, chapter 19 scanlator, chapter 20 name, chapter 20 scanlator, chapter 21 name, chapter 21 scanlator, chapter 22 name, chapter 22 scanlator, chapter 23 name, chapter 23 scanlator, chapter 24 name, chapter 24 scanlator, chapter 25 name, chapter 25 scanlator, chapter 26 name, chapter 26 scanlator, chapter 27 name, chapter 27 scanlator, chapter 28 name, chapter 28 scanlator, chapter 29 name, chapter 29 scanlator, chapter 30 name, chapter 30 scanlator, chapter 31 name, chapter 31 scanlator, chapter 32 name, chapter 32 scanlator, chapter 33 name, chapter 33 scanlator, chapter 34 name, chapter 34 scanlator, chapter 35 name, chapter 35 scanlator, chapter 36 name, chapter 36 scanlator, chapter 37 name, chapter 37 scanlator, chapter 38 name, chapter 38 scanlator, chapter 39 name, chapter 39 scanlator, chapter 40 name, chapter 40 scanlator, chapter 41 name, chapter 41 scanlator, chapter 42 name, chapter 42 scanlator, chapter 43 name, chapter 43 scanlator, chapter 44 name, chapter 44 scanlator, chapter 45 name, chapter 45 scanlator, chapter 46 name, chapter 46 scanlator, chapter 47 name, chapter 47 scanlator, chapter 48 name, chapter 48 scanlator, chapter 49 name, chapter 49 scanlator, chapter 50 name, chapter 50 scanlator, chapter 51 name, chapter 51 scanlator, chapter 52 name, chapter 52 scanlator, chapter 53 name, chapter 53 scanlator, chapter 54 name, chapter 54 scanlator, chapter 55 name, chapter 55 scanlator, chapter 56 name, chapter 56 scanlator, chapter 57 name, chapter 57 scanlator, chapter 58 name, chapter 58 scanlator, chapter 59 name, chapter 59 scanlator, chapter 60 name, chapter 60 scanlator, chapter 61 name, chapter 61 scanlator, chapter 62 name, chapter 62 scanlator, chapter 63 name, chapter 63 scanlator, chapter 64 name, chapter 64 scanlator, chapter 65 name, chapter 65 scanlator, chapter 66 name, chapter 66 scanlator, chapter 67 name, chapter 67 scanlator, chapter 68 name, chapter 68 scanlator, chapter 69 name, chapter 69 scanlator, chapter 70 name, chapter 70 scanlator, chapter 71 name, chapter 71 scanlator, chapter 72 name, chapter 72 scanlator, chapter 73 name, chapter 73 scanlator, chapter 74 name, chapter 74 scanlator, chapter 75 name, chapter 75 scanlator, chapter 76 name, chapter 76 scanlator, chapter 77 name, chapter 77 scanlator, chapter 78 name, chapter 78 scanlator, chapter 79 name, chapter 79 scanlator, chapter 80 name, chapter 80 scanlator, chapter 81 name, chapter 81 scanlator, chapter 82 name, chapter 82 scanlator, chapter 83 name, chapter 83 scanlator, chapter 84 name, chapter 84 scanlator, chapter 85 name, chapter 85 scanlator, chapter 86 name, chapter 86 scanlator, chapter 87 name, chapter 87 scanlator, chapter 88 name, chapter 88 scanlator, chapter 89 name, chapter 89 scanlator, chapter 90 name, chapter 90 scanlator, chapter 91 name, chapter 91 scanlator, chapter 92 name, chapter 92 scanlator, chapter 93 name, chapter 93 scanlator, chapter 94 name, chapter 94 scanlator, chapter 95 name, chapter 95 scanlator, chapter 96 name, chapter 96 scanlator, chapter 97 name, chapter 97 scanlator, chapter 98 name, chapter 98 scanlator, chapter 99 name, chapter 99 scanlator, chapter 100 name, chapter 100 scanlator, chapter 101 name, chapter 101 scanlator, chapter 102 name, chapter 102 scanlator, chapter 103 name, chapter 103 scanlator, chapter 104 name, chapter 104 scanlator, chapter 105 name, chapter 105 scanlator, chapter 106 name, chapter 106 scanlator, chapter 107 name, chapter 107 scanlator, chapter 108 name, chapter 108 scanlator, chapter 109 name, chapter 109 scanlator, chapter 110 name, chapter 110 scanlator, chapter 111 name, chapter 111 scanlator, chapter 112 name, chapter 112 scanlator, chapter 113 name, chapter 113 scanlator, chapter 114 name, chapter 114 scanlator, chapter 115 name, chapter 115 scanlator, chapter 116 name, chapter 116 scanlator, chapter 117 name, chapter 117 scanlator, chapter 118 name, chapter 118 scanlator, chapter 119 name, chapter 119 scanlator, chapter 120 name, chapter 120 scanlator, chapter 121 name, chapter 121 scanlator, chapter 122 name, chapter 122 scanlator, chapter 123 name, chapter 123 scanlator, chapter 124 name, chapter 124 scanlator, chapter 125 name, chapter 125 scanlator, chapter 126 name, chapter 126 scanlator, chapter 127 name, chapter 127 scanlator, chapter 128 name, chapter 128 scanlator, chapter 129 name, chapter 129 scanlator, chapter 130 name, chapter 130 scanlator, chapter 131 name, chapter 131 scanlator, chapter 132 name, chapter 132 scanlator, chapter 133 name, chapter 133 scanlator, chapter 134 name, chapter 134 scanlator, chapter 135 name, chapter 135 scanlator, chapter 136 name, chapter 136 scanlator, chapter 137 name, chapter 137 scanlator, chapter 138 name, chapter 138 scanlator, chapter 139 name, chapter 139 scanlator, chapter 140 name, chapter 140 scanlator, chapter 141 name, chapter 141 scanlator, chapter 142 name, chapter 142 scanlator, chapter 143 name, chapter 143 scanlator, chapter 144 name, chapter 144 scanlator, chapter 145 name, chapter 145 scanlator, chapter 146 name, chapter 146 scanlator, chapter 147 name, chapter 147 scanlator, chapter 148 name, chapter 148 scanlator, chapter 149 name, chapter 149 scanlator, chapter 150 name, chapter 150 scanlator, chapter 151 name, chapter 151 scanlator, chapter 152 name, chapter 152 scanlator, chapter 153 name, chapter 153 scanlator, chapter 154 name, chapter 154 scanlator, chapter 155 name, chapter 155 scanlator, chapter 156 name, chapter 156 scanlator, chapter 157 name, chapter 157 scanlator, chapter 158 name, chapter 158 scanlator, chapter 159 name, chapter 159 scanlator, chapter 160 name, chapter 160 scanlator, chapter 161 name, chapter 161 scanlator, chapter 162 name, chapter 162 scanlator, chapter 163 name, chapter 163 scanlator, chapter 164 name, chapter 164 scanlator, chapter 165 name, chapter 165 scanlator, chapter 166 name, chapter 166 scanlator, chapter 167 name, chapter 167 scanlator, chapter 168 name, chapter 168 scanlator, chapter 169 name, chapter 169 scanlator, chapter 170 name, chapter 170 scanlator, chapter 171 name, chapter 171 scanlator, chapter 172 name, chapter 172 scanlator, chapter 173 name, chapter 173 scanlator, chapter 174 name, chapter 174 scanlator, chapter 175 name, chapter 175 scanlator, chapter 176 name, chapter 176 scanlator, chapter 177 name, chapter 177 scanlator, chapter 178 name, chapter 178 scanlator, chapter 179 name, chapter 179 scanlator, chapter 180 name, chapter 180 scanlator, chapter 181 name, chapter 181 scanlator, chapter 182 name, chapter 182 scanlator, chapter 183 name, chapter 183 scanlator, chapter 184 name, chapter 184 scanlator, chapter 185 name, chapter 185 scanlator, chapter 186 name, chapter 186 scanlator, chapter 187 name, chapter 187 scanlator, chapter 188 name, chapter 188 scanlator, chapter 189 name, chapter 189 scanlator, chapter 190 name, chapter 190 scanlator, chapter 191 name, chapter 191 scanlator, chapter 192 name, chapter 192 scanlator, chapter 193 name, chapter 193 scanlator, chapter 194 name, chapter 194 scanlator, chapter 195 name, chapter 195 scanlator, chapter 196 name, chapter 196 scanlator, chapter 197 name, chapter 197 scanlator, chapter 198 name, chapter 198 scanlator, chapter 199 name, chapter 199 scanlator, chapter 200 name, chapter 200 scanlator, chapter 201 name, chapter 201 scanlator, chapter 202 name, chapter 202 scanlator, chapter 203 name, chapter 203 scanlator, chapter 204 name, chapter 204 scanlator, chapter 205 name, chapter 205 scanlator, chapter 206 name, chapter 206 scanlator, chapter 207 name, chapter 207 scanlator, chapter 208 name, chapter 208 scanlator, chapter 209 name, chapter 209 scanlator, chapter 210 name, chapter 210 scanlator, chapter 211 name, chapter 211 scanlator, chapter 212 name, chapter 212 scanlator, chapter 213 name, chapter 213 scanlator, chapter 214 name, chapter 214 scanlator, chapter 215 name, chapter 215 scanlator, chapter 216 name, chapter 216 scanlator |  |  |  |
| chapters | PASS | 216 chapters |  |  |  |
| chapter dates | PASS | 216 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.faust-web.com/.../page_0001_1769437526_17c1561c.jpg` (image/jpeg, 808748 bytes, 720x8100) |  |  |  |
