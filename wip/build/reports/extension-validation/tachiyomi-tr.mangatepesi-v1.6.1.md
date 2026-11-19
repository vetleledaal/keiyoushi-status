# Extension Validation Report

- Extension: tachiyomi-tr.mangatepesi-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4148262432517288785
- Source name: Manga Tepesi
- Source language: tr
- Selected manga input: popular offset 0: Strongest Anti META (`.../4`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 18 | Strongest Anti META (`.../4`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 6 | Guard Pass (`.../24`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Strongest Anti META (`.../4`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Strongest Anti META (`.../4`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 331 | Bölüm 1 (`.../23`) |  | <1s |
| pages | `getPageList(chapter)` | success | 20 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 18 entries |  |  |  |
| latest listing | PASS | 6 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Strongest Anti META, URL=`.../4` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 25/25 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 25/25 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://api.mangatepesi.com/.../strongest-anti-meta.jpg` (image/jpeg, 84888 bytes, 300x400) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../4` |  |  |  |
| details thumbnail URL | PASS | `https://api.mangatepesi.com/.../strongest-anti-meta.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhua |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Bütün gün, her gün genellikle tehlikeli bir şekilde milleti kazıklıyor. Dünya değiştiren Xue Que, muazzam güçler kazanmak için blöf yapıyor çünkü tek yapabileceği bu.<br><br>**Yıl:** 2017 |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 320 name |  |  |  |
| chapters | PASS | 331 chapters |  |  |  |
| chapter dates | PASS | 331 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://api.mangatepesi.com/.../f68f7602645a567016268d1b0a129378.jpg` (image/jpeg, 454080 bytes, 900x1263) |  |  |  |
