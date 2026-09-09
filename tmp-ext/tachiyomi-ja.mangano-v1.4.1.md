# Extension Validation Report

- Extension: tachiyomi-ja.mangano-v1.4.1
- Input artifact: JAR
- Generated at: 2026-09-09T18:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 34
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7717838940254847800
- Source name: MangaNo
- Source language: ja
- Selected manga input: popular offset 0: 殺人ウサギガールvs○○○ (`.../1042dbf07af95ef6064`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 100 | 殺人ウサギガールvs○○○ (`.../1042dbf07af95ef6064`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 100 | 本宮夫婦 (`.../104e46f60e4b6e96958`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 100 | Hello me〜 (`.../104bcf56a968c6666a4`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | 殺人ウサギガールvs○○○ (`.../1042dbf07af95ef6064`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | 殺人ウサギガールvs○○○ (`.../1042dbf07af95ef6064`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 17 | 前編 (`.../1052ebf07af95ef6064`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 11 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 100 entries |  |  |  |
| latest listing | PASS | 100 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=殺人ウサギガールvs○○○, URL=`1042dbf07af95ef6064` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 301/301 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 301/301 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://img.manga-no.com/.../2742b43f-c08a-472a-a3e8-6edbd5b33c3e` (image/jpeg, 528521 bytes, 1200x675) |  |  |  |
| details identity | PASS | Details preserved selected URL `1042dbf07af95ef6064` |  |  |  |
| details thumbnail URL | PASS | `https://img.manga-no.com/.../2742b43f-c08a-472a-a3e8-6edbd5b33c3e` |  |  |  |
| details author | PASS | ナガサワヒロ |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | LINT | Genres is empty; use null when unknown |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | 恐怖の殺人ウサギガールが様々なものに戦いを挑む。 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 17 chapters |  |  |  |
| chapter dates | PASS | 17 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://img.manga-no.com/.../25ecdda1-6ae9-44de-8892-2068e43edd37` (image/jpeg, 577154 bytes, 1050x1485) |  |  |  |
