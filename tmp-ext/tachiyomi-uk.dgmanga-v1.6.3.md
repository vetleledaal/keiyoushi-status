# Extension Validation Report

- Extension: tachiyomi-uk.dgmanga-v1.6.3
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
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
- Selected manga input: popular offset 0: Імператор та лицарка (`.../693431a8f5d2a8f84d7ad970`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 27 | Імператор та лицарка (`.../693431a8f5d2a8f84d7ad970`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 27 | Тримай мене на повідку (`.../6933ebd36fdf4ccb8752a62f`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 24 | Порок крові (`.../6a48089e5ac2c9e090b60fa6`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 25 | Пізньоцвіт (`.../6a69022904a2a0b202fcb12b`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Імператор та лицарка (`.../693431a8f5d2a8f84d7ad970`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Імператор та лицарка (`.../693431a8f5d2a8f84d7ad970`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 102 | Том 1 Розділ 1  (`.../693431a8f5d2a8f84d7ad970`) |  | <1s |
| pages | `getPageList(chapter)` | success | 9 |  |  | <1s |

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
| popular listing | PASS | 27 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Імператор та лицарка, URL=`693431a8f5d2a8f84d7ad970` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 104/104 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 104/104 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.dgmanga.app/.../1770747559164-71bb9857024e6271-dddoddddddod-3-ndddd-ddddnddddd.PNG` (image/png, 720082 bytes, 1200x1614) |  |  |  |
| details identity | PASS | Details preserved selected URL `693431a8f5d2a8f84d7ad970` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.dgmanga.app/.../1770747559164-71bb9857024e6271-dddoddddddod-3-ndddd-ddddnddddd.PNG` |  |  |  |
| details author | PASS | 안경워숭이 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | 16+, Манхва, Драма, Історія, Фентезі, Бойовик, Романтика, Жорстокість, Історичний сеттинг, Адаптація, Аристократія, Війна, ГГ жінка, Політика |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Пауліану подолали, і вона була захоплена у полон армією ворожої країни Акрії. Вона відчайдушно намагалася вижити в чоловічому товаристві, але все було марно. Молодий король Акрії, Люціус, побачив її боротьбу та зробив неочікувану пропозицію. Він мріє продовжити війну та стати першим імператором, що скорить Південний континент і море. Пауліана присягнула на вірність Люціусу за те, що він її визнав. Однак, зрештою, Люціус - просто імператор, який на полі бою усвідомив свої почуття до Пауліани.<br><br>Альтернативні назви:  |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description, chapter 1 name, chapter 2 name, chapter 3 name, chapter 4 name, chapter 7 name, chapter 8 name, chapter 9 name, chapter 10 name, chapter 11 name, chapter 12 name, chapter 13 name, chapter 14 name, chapter 15 name, chapter 16 name, chapter 17 name, chapter 18 name, chapter 19 name, chapter 20 name, chapter 21 name, chapter 22 name, chapter 23 name, chapter 24 name, chapter 25 name, chapter 26 name, chapter 27 name, chapter 28 name, chapter 29 name, chapter 30 name, chapter 31 name, chapter 32 name, chapter 33 name, chapter 34 name, chapter 35 name, chapter 36 name, chapter 37 name, chapter 38 name, chapter 39 name, chapter 40 name, chapter 41 name, chapter 42 name, chapter 43 name, chapter 44 name, chapter 45 name, chapter 46 name, chapter 47 name, chapter 48 name, chapter 49 name, chapter 50 name, chapter 51 name, chapter 52 name, chapter 53 name, chapter 54 name, chapter 55 name, chapter 56 name, chapter 57 name, chapter 58 name, chapter 59 name, chapter 61 name, chapter 62 name, chapter 63 name, chapter 64 name, chapter 65 name, chapter 66 name, chapter 67 name, chapter 68 name, chapter 69 name, chapter 70 name, chapter 71 name, chapter 72 name, chapter 73 name, chapter 74 name, chapter 75 name, chapter 76 name, chapter 77 name, chapter 78 name, chapter 79 name, chapter 80 name, chapter 81 name, chapter 82 name, chapter 83 name, chapter 84 name, chapter 85 name, chapter 86 name, chapter 87 name, chapter 88 name, chapter 89 name, chapter 90 name, chapter 91 name, chapter 92 name, chapter 93 name, chapter 94 name, chapter 95 name, chapter 96 name, chapter 97 name, chapter 98 name, chapter 99 name, chapter 100 name, chapter 101 name, chapter 102 name |  |  |  |
| chapters | PASS | 102 chapters |  |  |  |
| chapter dates | PASS | 102 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.dgmanga.app/.../1765028281551-1a023a967fb1b337-page-01.jpg` (image/jpeg, 293642 bytes, 790x6667) |  |  |  |
