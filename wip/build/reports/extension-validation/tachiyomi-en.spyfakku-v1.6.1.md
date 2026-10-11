# Extension Validation Report

- Extension: tachiyomi-en.spyfakku-v1.6.1
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6202325652827735606
- Source name: SpyFakku
- Source language: en
- Selected manga input: popular offset 0: Tokyo Black Box Case.16 The Sadistic Professor's Case Report - Breaking the Rookie Female Investigator! (`.../18948 <redacted query values: 27 and hash>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 24 | Tokyo Black Box Case.16 The Sadistic Professor's Case Report - Breaking the Rookie Female Investigator! (`.../18948 <redacted query values: 27 and hash>`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 24 | Handle With Care (`.../18830 <redacted query values: 24 and hash>`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 24 | Be Honest For Once! 2 (`.../19011 <redacted query values: 18 and hash>`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 24 | Pleasant Illusion ~2nd Show~ (`.../18987 <redacted query values: 14 and hash>`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Tokyo Black Box Case.16 The Sadistic Professor's Case Report - Breaking the Rookie Female Investigator! (`.../18948 <redacted query values: 27 and hash>`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Tokyo Black Box Case.16 The Sadistic Professor's Case Report - Breaking the Rookie Female Investigator! (`.../18948 <redacted query values: 27 and hash>`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../18948 <redacted query values: 27 and hash>`) |  | <1s |
| pages | `getPageList(chapter)` | success | 27 |  |  | 1-10s |

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
| popular listing | PASS | 24 entries |  |  |  |
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tokyo Black Box Case.16 The Sadistic Professor's Case Report - Breaking the Rookie Female Investigator!, URL=`.../18948 <redacted query values: 27 and hash>` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `<redacted URL #1: resource; absolute; valid web scheme; workstation or local network; query parameters: type>` (image/webp (encoding: lossy), 74274 bytes, 800x1138) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../18948 <redacted query values: 27 and hash>` |  |  |  |
| details thumbnail URL | PASS | `<redacted URL #1: resource; absolute; valid web scheme; workstation or local network; query parameters: type>` |  |  |  |
| details author | PASS | Shimohara |  |  |  |
| details artist | PASS | Shimohara |  |  |  |
| details genres | PASS | Busty, Fangs, Fingering, Hentai, Nakadashi, Stockings, Story Arc, Swallowing, Tsundere, Uncensored, Unlimited, Vanilla, X-ray |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Publishers: FAKKU<br>Magazines: Dascomi Vol.44<br>Parodies: Original Work<br>Pages: 27<br><br>Released: Friday, 11 Sep 2026 02:00 (CEST)<br>Added: Saturday, 26 Sep 2026 06:11 (CEST)<br>Size: 26.36 MB |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 27 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `<redacted URL #2: resource; absolute; valid web scheme; workstation or local network>` (image/png, 3246895 bytes, 1337x1920) |  |  |  |
