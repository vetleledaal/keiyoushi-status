# Extension Validation Report

- Extension: tachiyomi-id.crotpedia-v1.6.4
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 2
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 4023890583976163058
- Source name: CrotPedia
- Source language: id
- Selected manga input: popular offset 0: Angelic Cousin (`.../angelic-cousin`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 16 | Angelic Cousin (`.../angelic-cousin`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 16 | Benkyou toka Shinakute (`.../benkyou-toka-shinakute`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 16 | Sei Tsutomu Chousa wa Totsuzen ni Aisuru Tsuma e no Namahame Chousa (`.../sei-tsutomu-chousa-wa-totsuzen-ni-aisuru-tsuma-e-no-namahame-chousa`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 16 | Tsuite, Neratte, Otoshite (`.../tsuite-neratte-otoshite`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Angelic Cousin (`.../angelic-cousin`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Angelic Cousin (`.../angelic-cousin`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter 1 (`.../angelic-cousin-chapter-1-bahasa-indonesia`) |  | <1s |
| pages | `getPageList(chapter)` | success | 36 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Angelic Cousin, URL=`.../angelic-cousin` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=Benkyou toka Shinakute, URL=`.../benkyou-toka-shinakute` at page 1 offset 11 and page 2 offset 0 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 65/65 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 65/65 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i0.wp.com/.../Angelic-Cousin.jpg <redacted query values: resize>` (image/jpeg, 24000 bytes, 225x310) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../angelic-cousin` |  |  |  |
| details thumbnail URL | PASS | `https://i0.wp.com/.../Angelic-Cousin.jpg <redacted query values: resize>` |  |  |  |
| details author | PASS | Kakao |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Ahegao, Big Breast, Inseki, Nakadashi, Sole Female, Sole Male, Uncensored, Vanilla, Virginity, Doujinshi |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Gadis perang pirang menyerang.<br><br>Alternative Name: エンジェリック・カズン |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | LINT | All 1 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 36 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://reader.eromanga.cfd/.../cf1a6036c68ab2585d78e7eb74134f5b.jpg` (image/jpeg, 213588 bytes, 1440x2034) |  |  |  |
