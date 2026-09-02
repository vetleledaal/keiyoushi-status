# Extension Validation Report

- Extension: tachiyomi-it.mangaworld-v1.4.14
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
- Source ID: 7114846210461894145
- Source name: Mangaworld
- Source language: it
- Selected manga input: latest offset 0: Martial Peak (`.../martial-peak`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 16 | One Piece (`.../one-piece`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 16 | Naruto (`.../naruto`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 16 | Martial Peak (`.../martial-peak`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 16 | Melt Bless You (`.../melt-bless-you`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Martial Peak (`.../martial-peak`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Martial Peak (`.../martial-peak`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 2615 | Capitolo 01 (`.../5fa8b16e6af12c711b46b2b9 <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 19 |  |  | 1-10s |

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
| popular listing | PASS | 16 entries |  |  |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Martial Peak, URL=`.../martial-peak` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 65/65 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 65/65 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.mangaworld.mx/.../5fa8afef25d77b716a36c9be.png <redacted query values: 1788351562755>` (image/png, 1704783 bytes, 1000x1415) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../martial-peak` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.mangaworld.mx/.../5fa8afef25d77b716a36c9be.png <redacted query values: 1788351562755>` |  |  |  |
| details author | PASS | Momo (III) |  |  |  |
| details artist | PASS | Pikapi |  |  |  |
| details genres | PASS | Azione, Avventura, Commedia, Fantasy, Harem, Arti Marziali, Romantico, Sci-fi, Shounen, Soprannaturale |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Il viaggio verso il picco della arti marziali è lungo e solitario. Bisogna affrontare avversità inimmaginabili senza mai arrendersi per poter sopravvivere. Solo allora si riuscirà a migliorare e a continuare il proprio viaggio per diventare più forti. Il Padiglione dei cieli tempra i propri discepoli nel modo più duro possibile per prepararli a questo viaggio. Un giorno, un debole addetto alle pulizie, di nome Yang Kai riesce ad ottenere un libro nero, questo strano avvenimento lo avvierà verso il viaggo nel mondo delle arti marziali.<br><br>Titoli alternativi: Võ Luyện Đỉnh Phong, Wu Lian Dian Feng, Wu Lian Dianfeng, Wǔ Liàn Diān Fēng, Wǔ Liàn Diānfēng, 武炼巅峰, 무련전봉 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2615 chapters |  |  |  |
| chapter dates | PASS | 2615 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.mangaworld.mx/.../1.jpg` (image/jpeg, 529671 bytes, 800x1800) |  |  |  |
