# Extension Validation Report

- Extension: tachiyomi-ru.readmanga-v1.6.90
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5
- Source name: ReadManga
- Source language: ru
- Selected manga input: latest offset 0: Выбери меня! (`.../vyberi_menia_`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | Поднятие уровня в одиночку (`.../podniatie_urovnia_v_odinochku__A5ea4`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 50 | Ранкер, который живёт второй раз (`.../ranker__kotoryi_jivet_vtoroi_raz__A35c96`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 50 | Выбери меня! (`.../vyberi_menia_`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 50 | Атака признанием (`.../ataka_priznaniem`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Выбери меня! (`.../vyberi_menia_`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Выбери меня! (`.../vyberi_menia_`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 217 | 1 - 1 (`.../1 <redacted query values: mtr>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 10 |  |  | 1-10s |

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
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 50 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Выбери меня!, URL=`.../vyberi_menia_` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 201/201 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 201/201 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://rm.one-way.work/.../573.webp` (image/webp (encoding: lossy), 45246 bytes, 325x450) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../vyberi_menia_` |  |  |  |
| details thumbnail URL | PASS | `https://rm.one-way.work/.../573.webp` |  |  |  |
| details author | PASS | Хермод, Чу Уне |  |  |  |
| details artist | PASS | Васакпасак |  |  |  |
| details genres | PASS | манхва, боевик, драма, научная фантастика, приключения, психология, сверхъестественное, сёнэн, трагедия, артефакты, выживание, гг имба, гг мужчина, навыки, насилие, по мотивам романа, подземелья, умный гг |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★✬ 9.4 (голосов: 2617)<br>От студии, создавшей «Поднятие Уровня в одиночку», «Возвращение героя уровня катастрофы» и «Всеведущий читатель»! «Выбери меня!» — мобильная гатя, известная невероятной сложностью. Один из пяти сильнейших «мастеров» мира Хан Со Джин потерял сознание во время прохождения особого подземелья, а очнулся уже в теле 1-звёздочного персонажа по имени Хан Ислат под управлением другого игрока. Чтобы вернуться обратно, ему придётся возглавить команду героев и пройти 100 уровней подземелья без права на ошибку.<br>**Альтернативные названия**:<br>- Выбери меня!<br>- Pick Me Up!<br>- Me Escolhe! Gacha Infinito<br>- Pick Me Up<br>- Pick Me Up, Infinite Gacha<br>- PICK ME UP～低レア★英雄の成り上がり～<br>- PICK ME UP～低レア英雄の成り上がり～<br>- ¡Escógeme! Gacha Infinito<br>- ピックミーアップ！低レア英雄の成り上がり<br>- レア度★1の英雄として生き残る方法~PICK ME UP~<br>- 픽 미 업! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 217 chapters |  |  |  |
| chapter dates | PASS | 217 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://p7.rmr.rocks/.../1.png_res.png <redacted query values: t, u, and h>` (image/png, 6177202 bytes, 720x14060) |  |  |  |
