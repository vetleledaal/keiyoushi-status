# Extension Validation Report

- Extension: tachiyomi-pt.taosect-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 784276282691018699
- Source name: Tao Sect
- Source language: pt-BR
- Selected manga input: popular offset 0: One Punch Man (`.../one-punch-man`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | One Punch Man (`.../one-punch-man`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 18 | It’s My Life (`.../its-my-life`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 2 | One Punch Man (`.../one-punch-man`) |  | 10s+ |
| latest_next | `getLatestUpdates(2)` | success | 12 | 86 (Eighty Six) Fragmental Neoteny (`.../86-eighty-six-fragmental-neoteny`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | One Punch Man (`.../one-punch-man`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | One Punch Man (`.../one-punch-man`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 329 | Capítulo 01 (`.../cap-tulo-01`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 19 |  |  | 10s+ |

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
| latest listing | PASS | 2 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=One Punch Man, URL=`.../one-punch-man` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 51/51 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 51/51 manga have thumbnail URLs |  |  |  |
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
| chapters | PASS | 329 chapters |  |  |  |
| chapter dates | PASS | 329 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 19 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://drive.google.com/.../thumbnail <redacted query values: id and sz>` to `https://lh3.googleusercontent.com/.../1a4UMZYeQodZth-dMKgFdEm78QuB1hBV5=w1000` (1 redirects); popular: `https://drive.google.com/.../thumbnail <redacted query values: id and sz>` to `https://lh3.googleusercontent.com/.../1a4UMZYeQodZth-dMKgFdEm78QuB1hBV5=w1000` (1 redirects) |  |  |  |
| page load | PASS | `https://drive.google.com/.../thumbnail <redacted query values: id and sz>` (image/jpeg, 55694 bytes, 431x640) |  |  |  |
