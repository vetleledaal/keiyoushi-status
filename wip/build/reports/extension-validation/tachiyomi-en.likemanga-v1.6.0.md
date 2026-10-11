# Extension Validation Report

- Extension: tachiyomi-en.likemanga-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 35
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6236979603959140497
- Source name: LikeManga
- Source language: en
- Selected manga input: popular offset 0: Revenge of the Baskerville Bloodhound (`.../revenge-of-the-baskerville-bloodhound-3573`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | Revenge of the Baskerville Bloodhound (`.../revenge-of-the-baskerville-bloodhound-3573`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | success | 36 | Onepunch-Man (`.../onepunchman-8328`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 36 | Teisou Gyakuten Sekai Nara Moteru to Omotte Itara (`.../teisou-gyakuten-sekai-nara-moteru-to-omotte-itara-37522`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 36 | May Lady Ungnyeo Protect Us (`.../may-lady-ungnyeo-protect-us-38775`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Revenge of the Baskerville Bloodhound (`.../revenge-of-the-baskerville-bloodhound-3573`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Revenge of the Baskerville Bloodhound (`.../revenge-of-the-baskerville-bloodhound-3573`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 186 | Chapter 1 (`.../chapter-1-252196`) |  | 1-10s |
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
| popular listing | PASS | 36 entries |  |  |  |
| latest listing | PASS | 36 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Revenge of the Baskerville Bloodhound, URL=`.../revenge-of-the-baskerville-bloodhound-3573` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 145/145 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 145/145 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://likemanga.ink/.../1691806004-64d6e934d8689-returnoftheironbloodedhound8662193x278.jpg` (image/jpeg, 68348 bytes, 250x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../revenge-of-the-baskerville-bloodhound-3573` |  |  |  |
| details thumbnail URL | PASS | `https://likemanga.ink/.../1691806004-64d6e934d8689-returnoftheironbloodedhound8662193x278.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | He was the hound of the Baskerville family: Vikir. Yet his loyalty was rewarded by the blade of a guillotine dirtied by slander. “I will never live the life of a hound slaughtered after the rabbit is caught.” In place of death, an unexpected opportunity awaits him. Vicir’s eyes glowed red as he sharpened his canines in the dark. “Just you wait, Hugo. I will rip out your throat this time.” It’s time for the hound to exact bloody revenge on his owner. Regression of the Ironblade Hound Return of the Iron-Blooded Sword Hound Revenge of the Iron-Blooded Sword Hound The Return of the Iron-blood Sword Hound 철혈검가 사냥개의 회귀 Revenge of the Sword Clan’s Hound |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 186 chapters |  |  |  |
| chapter dates | LINT | 41 of 186 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=41 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 10 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://like.mgread.io/.../1.jpg` (image/jpeg, 3993359 bytes, 800x16488) |  |  |  |
