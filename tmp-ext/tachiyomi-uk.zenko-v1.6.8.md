# Extension Validation Report

- Extension: tachiyomi-uk.zenko-v1.6.8
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
- Source ID: 8431849810637608898
- Source name: Zenko
- Source language: uk
- Selected manga input: popular offset 0: Загублений у хмарі (`.../74`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 15 | Загублений у хмарі (`.../74`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 15 | Лиходій дізнався моє справжнє обличчя (`.../337`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 15 | Пошук душі в мареннях (`.../4544`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 15 | Однокласниця що сидить біля мене, дивиться на мене хтивими очима (`.../1102`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 15 | Загублений у хмарі (`.../74`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Загублений у хмарі (`.../74`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 243 | Том 1 Розділ 1 (`.../12472`) |  | <1s |
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
| popular listing | PASS | 15 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Загублений у хмарі, URL=`.../74` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 75/75 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 75/75 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://storage.zenko.online/.../f3e1279a-3b1a-40c9-a17f-ebf6640c5be9` (image/webp (encoding: lossy), 144208 bytes, 898x1213) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../74` |  |  |  |
| details thumbnail URL | PASS | `https://storage.zenko.online/.../f3e1279a-3b1a-40c9-a17f-ebf6640c5be9` |  |  |  |
| details author | PASS | Paskim |  |  |  |
| details artist | PASS | Paskim |  |  |  |
| details genres | PASS | 16+, Драма, Шьонен-ай, Психологія, Школа, ГГ чоловік |  |  |  |
| details status | PASS | ON_HIATUS (6) |  |  |  |
| details description | PASS | У Ханиля є таємне хобі - фотографувати своє нерозділене кохання, Чан Іля. Але коли Хьонун натрапляє на хмарне сховище Ханиля, з його вражаючою колекцією фотографій, ситуація досить швидко загострюється. Спершу Ханиль вважає, що його таємниця в безпеці з Хьонуном, але все частіше потрапляє в ситуації, що наштовхують його на роздуми щодо істинних мотивів Хьонуна.<br>Чи збереже Хьонун секрет? Яка його справжня мета?<br><br>Альтернативні назви: Lost in the Cloud, 클라우드<br>Вподобайок: 91685 <br>Переглядів: 432487 <br>В закладинках у: 4857  |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 243 chapters |  |  |  |
| chapter dates | PASS | 243 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices must start at 0 and increase by 1. Pages 2 through 8 use index 0. |  |  |  |
| page URLs | PASS | 8 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://storage.zenko.online/.../81ef4d2e-faba-4db7-beb7-1a284d0c5d68` (image/jpeg, 83144 bytes, 1200x887) |  |  |  |
