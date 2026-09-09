# Extension Validation Report

- Extension: tachiyomi-ru.tomilolib-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7420534233267322527
- Source name: Tomilo-lib
- Source language: ru
- Selected manga input: latest offset 0: Всеобщий отбор: укротитель драконов в самом деле самый слабый класс? (`.../6998842745c6640d690250f2`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Моё перерождение в древо: Начало эволюции (`.../69483be137431a042d492671`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Наномашины (`.../693d0b8be623333a1078f4aa`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Всеобщий отбор: укротитель драконов в самом деле самый слабый класс? (`.../6998842745c6640d690250f2`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | Возвращение замороженного игрока (`.../69c97e53b56699c7b56ae248`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 30 | Всеобщий отбор: укротитель драконов в самом деле самый слабый класс? (`.../6998842745c6640d690250f2`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Всеобщий отбор: укротитель драконов в самом деле самый слабый класс? (`.../6998842745c6640d690250f2`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 280 | Глава 1 (`.../6998842745c6640d690250fb`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 10 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Всеобщий отбор: укротитель драконов в самом деле самый слабый класс?, URL=`i-got-the-weakest-class-dragon-tamer/6998842745c6640d690250f2` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 150/150 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 150/150 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://tomilolib.s3.regru.cloud/.../cover.jpeg` (image/jpeg, 196840 bytes, 700x1000) |  |  |  |
| details identity | PASS | Details preserved selected URL `i-got-the-weakest-class-dragon-tamer/6998842745c6640d690250f2` |  |  |  |
| details thumbnail URL | PASS | `https://tomilolib.s3.regru.cloud/.../cover.jpeg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Главный герой мужчина, Всесильный главный герой, Демоны, Драконы, Монстры, Разумные расы, Школа, Ранги силы, Магия, Насилие, Система, Игровые элементы, Гарем девушек, Фэнтези, Боевое, повседневность, приключения, Видеоигры, Сёнэн |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | В мире слияния реальности и игр свирепствуют кровожадные монстры, возвышаются бесчисленные данжи и подземелья. Чтобы противостоять ужасающим монстрам, все вынуждены проходить классовый отбор и совершенствоваться как сумасшедшие. В день своего отбора Лу Фань стал "укротителем драконов". Однако из-за того, что драконы слишком сильны и не поддаются приручению, этот класс считается самым ничтожным. К счастью, наш герой смог пробудить систему карты суперсокровищ, и, когда он уничтожил всё и вся своим гигантским драконом, мир содрогнулся.<br><br>Альтернативные названия: Worthless Profession: Dragon Tamer I'm Drako Majstro / Я получил слабейший класс Укротитель драконов!? / 全民转职：驭龙师是最弱职业？ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 280 chapters |  |  |  |
| chapter dates | PASS | 280 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://tomilolib.s3.regru.cloud/.../001.jpeg` (image/png, 12184595 bytes, 1274x29360; server Content-Type: image/jpeg) |  |  |  |
