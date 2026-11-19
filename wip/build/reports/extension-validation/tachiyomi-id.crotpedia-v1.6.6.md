# Extension Validation Report

- Extension: tachiyomi-id.crotpedia-v1.6.6
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 31
- Lint: 1
- Warnings: 1
- Skipped: 3
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: zmanga
- Source ID: 4023890583976163058
- Source name: CrotPedia
- Source language: id
- Selected manga input: popular offset 0: Icha Love Saimin Gimai (`.../icha-love-saimin-gimai`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 16 | Icha Love Saimin Gimai (`.../icha-love-saimin-gimai`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 16 | Amane-san to Issho (`.../amane-san-to-issho`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 16 | Sunao ni Nareyo (`.../sunao-ni-nareyo`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 16 | Neneko no Manegoto (`.../neneko-no-manegoto`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Icha Love Saimin Gimai (`.../icha-love-saimin-gimai`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Icha Love Saimin Gimai (`.../icha-love-saimin-gimai`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 2 | Chapter 1 (`.../icha-love-saimin-gimai-chapter-1-bahasa-indonesia`) |  | <1s |
| pages | `getPageList(chapter)` | success | 0 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Icha Love Saimin Gimai, URL=`.../icha-love-saimin-gimai` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 65/65 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 65/65 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://i0.wp.com/.../Icha-Love-Saimin-Gimai-v2.gif` (image/gif (format: 89a), 296925 bytes, 576x813) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../icha-love-saimin-gimai` |  |  |  |
| details thumbnail URL | PASS | `https://i0.wp.com/.../Icha-Love-Saimin-Gimai-v2.gif` |  |  |  |
| details author | PASS | Dochashiko |  |  |  |
| details artist | LINT | Artist is empty; use null when unknown |  |  |  |
| details genres | PASS | Ahegao, Censored, Incest, Kemonomimi, Mind Control, Nakadashi, Sister, Sole Female, Sole Male, Vanilla, Doujinshi |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Brocon dan Siscon. Hubungan terlarang kakak beradik.<br><br>Alternative Name: イチャラブ催眠義妹 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | SKIP | No pages to check |  |  |  |
| page URLs | FAIL | Page list is empty (0 pages) | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| duplicate page URLs | SKIP | No pages to check |  |  |  |
| redirects | UNUSUAL | popular: `https://crotpedia.net/.../icha-love-saimin-gimai-chapter-1-bahasa-indonesia` to `https://crotpedia.net/.../login` (2 redirects) |  |  |  |
| page load | SKIP | No pages to load |  |  |  |
