# Extension Validation Report

- Extension: tachiyomi-ru.tomilolib-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7420534233267322527
- Source name: Tomilo-lib
- Source language: ru
- Selected manga input: popular offset 0: Моё перерождение в древо: Начало эволюции (`.../69483be137431a042d492671`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | Моё перерождение в древо: Начало эволюции (`.../69483be137431a042d492671`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Я создал бункер в замороженном мире (`.../6a5df491094db469ba3d7a2c`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 30 | Некромант — я катастрофа (`.../693d413ae623333a10794941`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 30 | Элисед (`.../699eb704c70ced636d743dff`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 0 |  |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Моё перерождение в древо: Начало эволюции (`.../69483be137431a042d492671`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 536 | Глава 1 (`.../69483be137431a042d492676`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 7 |  |  | 1-10s |

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
| search listing | FAIL | 0 entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 120/120 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 120/120 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://tomilolib.s3.regru.cloud/.../cover.jpg` (image/jpeg, 357405 bytes, 800x1131) |  |  |  |
| details identity | PASS | Details preserved selected URL `moe-pererozhdenie-v-drevo-nachalo-evolyutsii-evolu/69483be137431a042d492671` |  |  |  |
| details thumbnail URL | PASS | `https://tomilolib.s3.regru.cloud/.../cover.jpg` |  |  |  |
| details author | PASS | Xia Yan |  |  |  |
| details artist | PASS | Kuaikan Manhua |  |  |  |
| details genres | PASS | Боевик, драма, Исекай, приключения, Сверхестественное, Сёнэн, Фэнтези, Экшен |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | После смерти Юй Цзыюй переродился и стал… Ивой!<br>Но сможет ли он приспособиться к этой, казалось бы, знакомой, но такой чужой реальности? Ведь его перерождение совпало с началом Великой эпохи возрождения духовной энергии.<br>С возвращением духовной силы мир изменился до неузнаваемости.<br>Рёв хищников теперь способен сотрясать горы и волновать реки, а могущественные существа заполонили мир, едва не разрывая его на части.<br>И всё же, в эту эпоху хаоса появилась величественная ива, обладающая способностью к бесконечной эволюции.<br>Её плоды дарят невероятные способности, а духовная энергия, исходящая от неё, усиливает силы всех существ, обитающих в её владениях.<br>…<br>Одни называют её мировым древом – Иггдрасилем, восхваляя её могущество день за днём.<br>Другие величают её «великим божественным древом», подпирающим небеса.<br>Кто-то говорит о ней как о «священном древе», а кто-то – как о «проклятом» или даже «дьявольском дереве»… И это далеко не все её имена.<br>Но как бы её ни называли, в каждом слове, произнесённом о ней, слышится трепет и благоговение.<br><br>Альтернативные названия: Starting Over as a Tree / Evolution Begins With a Big Tree / Evolution From a Tree / 从大树开始的进化 / 進化する者たち |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 536 chapters |  |  |  |
| chapter dates | PASS | 536 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 7 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://tomilolib.s3.regru.cloud/.../001.webp` (image/webp (encoding: lossy), 426794 bytes, 640x10392) |  |  |  |
