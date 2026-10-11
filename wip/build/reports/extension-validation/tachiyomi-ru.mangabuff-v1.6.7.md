# Extension Validation Report

- Extension: tachiyomi-ru.mangabuff-v1.6.7
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 30
- Lint: 1
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: REVIEW

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4008409601887986192
- Source name: MangaBuff
- Source language: ru
- Selected manga input: popular offset 0: Слезы на увядших цветах (`.../slezy-na-uvyadshih-cvetah`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Слезы на увядших цветах (`.../slezy-na-uvyadshih-cvetah`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Опрометчивый флирт (`.../sluchainaya-lyubov`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Вой (`.../voi`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Хроники ленивого властителя (`.../hroniki-lenivogo-vlastitelya`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Слезы на увядших цветах (`.../slezy-na-uvyadshih-cvetah`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Слезы на увядших цветах (`.../slezy-na-uvyadshih-cvetah`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 122 | Том 1 Глава 1  (`.../1`) |  | 1-10s |
| pages | `getPageList(chapter)` | error | 0 |  | eu.kanade.tachiyomi.network.HttpException: HTTP error 401 | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | ERROR | eu.kanade.tachiyomi.network.HttpException: HTTP error 401 | REVIEW | INSUFFICIENT_EVIDENCE |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Слезы на увядших цветах, URL=`.../slezy-na-uvyadshih-cvetah` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangabuff.ru/.../slezy-na-uvyadshih-cvetah.jpg` (image/jpeg, 172135 bytes, 883x1280) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../slezy-na-uvyadshih-cvetah` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mangabuff.ru/.../slezy-na-uvyadshih-cvetah.jpg <redacted query values: 17313207481>` (image/jpeg, 172135 bytes, 883x1280) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Манхва, 2024, 18+, Дзёсэй, Романтика, ГГ женщина, Насилие / жестокость, Горничные, Скрытие личности |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | В жизни На Хэ Су развернулась настоящая драма, которая казалась ей совершенно невыносимой. Ее муж, в который она вложила всю свою любовь и надежды, предал ее самым жестоким образом. Он не только загрузил их семью в бесконечные долги, утратив при этом их будущего ребенка, но и дозволил себе изменить На Хэ Су прямо перед ее глазами с гораздо более молодой женщиной. Эти раны казались непростительными, и жизнь, которая когда-то казалась счастливой, обернулась настоящим кошмаром. Казалось, что все кончено и жизнь На Хэ Су обречена на мучительное увядание и забвение, но судьба приготовила для нее неожиданный поворот. В ее жизнь неожиданно ворвался загадочный молодой человек, словно со страниц какого-то романа. Его прошлое было туманно, но его появление пробудило в душе На Хэ Су новые чувства. Он был одновременно и опасен, и невероятно притягателен, его подход к жизни и отношениям кардинально отличался от всех, кого она знала до этого. Его слова «Научи меня взрослой любви» стали для нее вызовом, ведущим к возможности заново обрести утраченную веру в любовь и, возможно, переписать историю собственной жизни. На Хэ Су невольно начинает откликаться на его дерзкие попытки тронуть ее сердце и постепенно осознает, что даже из глубочайшей боли и предательства можно извлечь уроки и получить шанс на новое начало.<br><br>Рейтинг: 89%<br><br>Просмотров: 125 595 652<br><br>Избранное: 71 873<br><br>Альтернативные названия:<br>• Tears on withered flowers<br>• 시든 꽃에 눈물을<br>• Слезы на усохшем цветке |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 1 name, chapter 2 name, chapter 3 name, chapter 4 name, chapter 5 name, chapter 6 name, chapter 7 name, chapter 8 name, chapter 9 name, chapter 10 name, chapter 11 name, chapter 12 name, chapter 13 name, chapter 14 name, chapter 15 name, chapter 16 name, chapter 17 name, chapter 18 name, chapter 19 name, chapter 20 name, chapter 21 name, chapter 22 name, chapter 23 name, chapter 24 name, chapter 25 name, chapter 26 name, chapter 27 name, chapter 28 name, chapter 29 name, chapter 30 name, chapter 31 name, chapter 32 name, chapter 33 name, chapter 34 name, chapter 35 name, chapter 36 name, chapter 37 name, chapter 38 name, chapter 39 name, chapter 40 name, chapter 41 name, chapter 42 name, chapter 43 name, chapter 44 name, chapter 45 name, chapter 46 name, chapter 47 name, chapter 48 name, chapter 49 name, chapter 50 name, chapter 51 name, chapter 52 name, chapter 53 name, chapter 54 name, chapter 55 name, chapter 56 name, chapter 57 name, chapter 58 name, chapter 59 name, chapter 60 name, chapter 61 name, chapter 62 name, chapter 63 name, chapter 64 name, chapter 65 name, chapter 66 name, chapter 67 name, chapter 68 name, chapter 69 name, chapter 70 name, chapter 71 name, chapter 72 name, chapter 73 name, chapter 74 name, chapter 75 name, chapter 76 name, chapter 77 name, chapter 78 name, chapter 79 name, chapter 80 name, chapter 81 name, chapter 82 name, chapter 83 name, chapter 84 name, chapter 85 name, chapter 86 name, chapter 87 name, chapter 88 name, chapter 89 name, chapter 90 name, chapter 91 name, chapter 92 name, chapter 93 name, chapter 94 name, chapter 95 name, chapter 96 name, chapter 97 name, chapter 98 name, chapter 99 name, chapter 100 name, chapter 101 name, chapter 102 name, chapter 103 name, chapter 104 name, chapter 105 name, chapter 106 name, chapter 107 name, chapter 108 name, chapter 109 name, chapter 110 name, chapter 111 name, chapter 112 name, chapter 113 name, chapter 114 name, chapter 115 name, chapter 116 name, chapter 117 name, chapter 118 name, chapter 119 name, chapter 120 name, chapter 121 name, chapter 122 name |  |  |  |
| chapters | PASS | 122 chapters |  |  |  |
| chapter dates | PASS | 122 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | SKIP | HTTP error 401 |  |  |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
