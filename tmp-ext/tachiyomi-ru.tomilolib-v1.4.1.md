# Extension Validation Report

- Extension: tachiyomi-ru.tomilolib-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
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
- Selected manga input: latest offset 0: Сказания о демонах и богах (`.../699fe880c70ced636d1cb0f8`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Моё перерождение в древо: Начало эволюции (`.../69483be137431a042d492671`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Я создал бункер в замороженном мире (`.../6a5df491094db469ba3d7a2c`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Сказания о демонах и богах (`.../699fe880c70ced636d1cb0f8`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | Прирождённый наёмник (`.../697ef9bc6c6ecb9d75442809`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 30 | Сказания о демонах и богах (`.../699fe880c70ced636d1cb0f8`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Сказания о демонах и богах (`.../699fe880c70ced636d1cb0f8`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 521 | Глава 1 (`.../699ffe2dc70ced636d2a2158`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 24 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Сказания о демонах и богах, URL=`skazaniya-o-demonah-i-bogah/699fe880c70ced636d1cb0f8` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 150/150 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 150/150 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://tomilolib.s3.regru.cloud/.../cover.jpg` (image/jpeg, 43695 bytes, 375x536) |  |  |  |
| details identity | PASS | Details preserved selected URL `skazaniya-o-demonah-i-bogah/699fe880c70ced636d1cb0f8` |  |  |  |
| details thumbnail URL | PASS | `https://tomilolib.s3.regru.cloud/.../cover.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | приключения, романтика, Фэнтези, Боевые искусства, Демоны, Магия, Путешествия во времени, Сверхъестественное |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Что бы вы сделали, если бы могли вернуться в свое прошлое с знаниями и опытом будущего? Не Ли, сильнейший в мире заклинатель демонов, получил такую возможность. Погибший в смертельной битве с Мудрецом-Императором, он возвращается в свои тринадцать лет с одной целью: исправить ошибки, защитить родных и близких, а также не допустить тех трагедий, которые произошли в его прошлой жизни.<br><br>И вот представьте, читать онлайн и абсолютно бесплатно историю о том, как бывший могущественный заклинатель демонов, оказавшись в теле тринадцатилетнего мальчика, начинает свой путь с нуля. Ему предстоит снова учиться, сталкиваться с насмешками и недоверием со стороны окружающих. Но Не Ли не опускает рук. Ведь у него есть нечто, чего нет у других — знания и опыт целой жизни.<br><br>Альтернативные названия: Tales of Demons and Gods |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 521 chapters |  |  |  |
| chapter dates | PASS | 521 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 24 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://tomilolib.s3.regru.cloud/.../001.jpg` (image/png, 518021 bytes, 920x1300; server Content-Type: image/jpeg) |  |  |  |
