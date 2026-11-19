# Extension Validation Report

- Extension: tachiyomi-ru.yaoilib-v1.6.3
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 2730544188738947015
- Source name: SlashLib
- Source language: ru
- Selected manga input: latest offset 0: Sami Plays the Game (`.../196204--sami-plays-the-game`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 60 | Secret Alliance (`.../23435--secret-alliance`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 60 | Nekomimi (`.../43789--nekomimi`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 15 | Sami Plays the Game (`.../196204--sami-plays-the-game`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 15 | DevilXpress (`.../240772--e-ling-zhai-jisong`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Sami Plays the Game (`.../196204--sami-plays-the-game`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Sami Plays the Game (`.../196204--sami-plays-the-game`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 100 | Том 1. Глава 1 (`.../chapter <redacted query values: , volume, and number>`) |  | 1-10s |
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
| popular listing | PASS | 60 entries |  |  |  |
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Sami Plays the Game, URL=`.../196204--sami-plays-the-game` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 151/151 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 151/151 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cover.lib.social/.../b78115c6-9166-4d8e-84d2-f0d0018a631b.jpg` (image/jpeg, 77216 bytes, 375x543) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../196204--sami-plays-the-game` |  |  |  |
| details thumbnail URL | PASS | `https://cover.lib.social/.../b78115c6-9166-4d8e-84d2-f0d0018a631b.jpg` |  |  |  |
| details author | PASS | Kang Eunyoung |  |  |  |
| details artist | PASS | Kang Eunyoung |  |  |  |
| details genres | PASS | Манхва, 16+, Драма, Повседневность, Романтика, Сёдзё, Школа, Дружба, ГГ женщина, ЛГБТ, Не слеш |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Сам И ведёт ответную игру<br>★★★★★ 9.69 (голосов: 3423)<br>Альтернативные названия:<br>吴杉伊的重启人生 / 小森的新人生 / 貧乏少女は再生する / 삼이는 재생한다<br><br>О Сам И, сбежавшая от идеальной жизни, живёт в крайней нищете.<br>Она сближается с Ким Пёджуном, внешне холодным, но обладающим тёплым сердцем, и с Ю Чаном, тайно находящим такое привлекательным.<br>Они оказываются вовлечены в странный любовный треугольник, вносящий хаос в их школьную жизнь.<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 100 chapters |  |  |  |
| chapter dates | PASS | 100 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | LINT | Page indices are 1-indexed, but should be 0-indexed |  |  |  |
| page URLs | FAIL | 9 of 10 pages have invalid URLs: page 2: url=`.../02_RsWi.png` (protocol-relative URL), page 3: url=`.../03_yaj2.png` (protocol-relative URL), page 4: url=`.../04_oe4V.png` (protocol-relative URL), page 5: url=`.../05_02Bn.png` (protocol-relative URL), page 6: url=`.../06_bXqq.png` (protocol-relative URL), and 4 more | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img3.hentaicdn.org/.../01_e6cF.png` (image/jpeg, 905755 bytes, 690x12760) |  |  |  |
