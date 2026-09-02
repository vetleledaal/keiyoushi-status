# Extension Validation Report

- Extension: tachiyomi-pt.taosect-v1.4.22
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 784276282691018699
- Source name: Tao Sect
- Source language: pt-BR
- Selected manga input: popular offset 0: One Punch Man (`.../one-punch-man`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 18 | One Punch Man (`.../one-punch-man`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 18 | It’s My Life (`.../its-my-life`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 1 | One Punch Man (`.../one-punch-man`) |  | 10s+ |
| latest_next | `fetchLatestUpdates(2)` | success | 0 |  |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | One Punch Man (`.../one-punch-man`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | One Punch Man (`.../one-punch-man`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 328 | Capítulo 01 (`.../cap-tulo-01`) |  | 10s+ |
| pages | `fetchPageList(chapter)` | success | 19 |  |  | 10s+ |

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
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 1 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=One Punch Man, URL=`.../one-punch-man` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | FAIL | Page 2 is empty despite page 1 advertising a next page | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 38/38 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 38/38 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://taosect.com/.../Volume_23_Cover.png` (image/png, 1890752 bytes, 760x1200) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../one-punch-man` |  |  |  |
| details thumbnail URL | PASS | `https://taosect.com/.../Volume_23_Cover.png` |  |  |  |
| details author | PASS | ONE |  |  |  |
| details artist | PASS | Murata Yuusuke |  |  |  |
| details genres | PASS | Ação, Artes Marciais, Comédia, Slice of life |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Conta o dia-a-dia de um herói normal que está infeliz por ser forte o bastante para derrotar todos os seus oponentes com apenas um soco, já que isso não lhe traz mais a sensação de adrenalina ao enfrentar um inimigo poderoso….<br><br>Título original: ワンパンマン<br>Serialização: Tonari no Young Jump |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 328 chapters |  |  |  |
| chapter dates | PASS | 328 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://drive.google.com/.../thumbnail <redacted query values: id and sz>` (image/jpeg, 55694 bytes, 431x640) |  |  |  |
