# Extension Validation Report

- Extension: tachiyomi-uk.dgmanga-v1.6.3
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8158890639660553015
- Source name: DGManga
- Source language: uk
- Selected manga input: popular offset 0: Жахлива ніч (`.../694a255ac9d550f834f977ce`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 25 | Жахлива ніч (`.../694a255ac9d550f834f977ce`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 28 | Казка мачухи (`.../693612fb9e191b86f1c10ff5`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 25 | Чужинець (`.../6acaa7a8674e668c1a5699a9`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Замкни мене, якщо хочеш (`.../6a85e46304a2a0b2023bc740`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Жахлива ніч (`.../694a255ac9d550f834f977ce`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Жахлива ніч (`.../694a255ac9d550f834f977ce`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 67 | Том 1 Розділ 1  (`.../694a255ac9d550f834f977ce`) |  | <1s |
| pages | `getPageList(chapter)` | success | 10 |  |  | <1s |

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
| popular listing | PASS | 25 entries |  |  |  |
| latest listing | PASS | 25 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Жахлива ніч, URL=`694a255ac9d550f834f977ce` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 104/104 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 104/104 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.dgmanga.app/.../1768391776609-eee75d9ac0372d14-tall.png` (image/png, 708912 bytes, 1200x1600) |  |  |  |
| details identity | PASS | Details preserved selected URL `694a255ac9d550f834f977ce` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.dgmanga.app/.../1768391776609-eee75d9ac0372d14-tall.png` |  |  |  |
| details author | PASS | Moan |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 18+, Манхва, Жахи, Ігри, Романтика, Яой |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Знову Пі Бада опинився в епіцентрі незвичайної горор-гри. Та цього разу гра була далека від комп’ютерних моніторів: щоб пройти всі випробування, хлопцю довелося багато чого витерпіти і не раз загинути. Спочатку все йшло за планом — він збирав підказки, розгадував таємниці та навіть вийшов на слід вбивці. Здавалося, фініш вже близько, залишалося лише пережити кілька нестерпних катувань і смертей. Але раптом щось змінилося. Нам Доха почав поводитися дивно. Чи можливо, що він теж учасник цієї гри? Однак його погляд… похмурий і лиховісний, ніби ховає щось набагато страшніше за гру. Що ж його чекає далі?<br><br>Альтернативні назви:  |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description, chapter 1 name, chapter 2 name, chapter 3 name, chapter 4 name, chapter 5 name, chapter 6 name, chapter 7 name, chapter 8 name, chapter 9 name, chapter 10 name, chapter 11 name, chapter 14 name, chapter 15 name, chapter 16 name, chapter 17 name, chapter 18 name, chapter 19 name, chapter 20 name, chapter 21 name, chapter 22 name, chapter 23 name, chapter 24 name, chapter 25 name, chapter 26 name, chapter 27 name, chapter 28 name, chapter 29 name, chapter 30 name, chapter 31 name, chapter 32 name, chapter 33 name, chapter 34 name, chapter 35 name, chapter 36 name, chapter 39 name, chapter 40 name, chapter 41 name, chapter 42 name, chapter 43 name, chapter 44 name, chapter 45 name, chapter 46 name, chapter 47 name, chapter 48 name, chapter 49 name, chapter 50 name, chapter 51 name, chapter 52 name, chapter 53 name, chapter 54 name, chapter 55 name, chapter 56 name, chapter 57 name, chapter 58 name, chapter 59 name, chapter 60 name, chapter 61 name, chapter 62 name, chapter 63 name, chapter 64 name, chapter 65 name, chapter 66 name, chapter 67 name |  |  |  |
| chapters | PASS | 67 chapters |  |  |  |
| chapter dates | PASS | 67 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.dgmanga.app/.../1766466924991-ea1b6215857955e0-page-01.jpg` (image/jpeg, 588462 bytes, 600x6858) |  |  |  |
