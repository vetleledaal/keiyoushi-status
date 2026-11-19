# Extension Validation Report

- Extension: tachiyomi-en.vyvymanga-v1.6.47
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
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
- Source ID: 6958928548959982041
- Source name: VyvyManga
- Source language: en
- Selected manga input: popular offset 0: Jinx (`.../jinx`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 36 | Jinx (`.../jinx`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 36 | Checkmate 〘R〙 (`.../checkmate-r`) |  | 1-10s |
| latest | `getLatestUpdates(1)` | success | 36 | The First King Adventure (`.../the-first-king-adventure`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | success | 36 | Skills have no cooldown, I turned into a natural disaster of undead (`.../skills-have-no-cooldown-i-turned-into-a-natural-disaster-of-undead`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 14 | Jinx (`.../jinx`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Jinx (`.../jinx`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 111 | Chapter 1 (`.../29adb54fb8`) |  | <1s |
| pages | `getPageList(chapter)` | success | 98 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Jinx, URL=`.../jinx` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 158/158 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 158/158 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://pvzcdelcc.xyz/.../thumbnail.png` (image/jpeg, 343030 bytes, 1104x1472; server Content-Type: image/png) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../jinx` |  |  |  |
| details thumbnail URL | PASS | `https://pvzcdelcc.xyz/.../thumbnail.png` |  |  |  |
| details author | PASS | Mingwa |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Webtoons, Smut, Mature, Yaoi, Romance, Drama |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | ★★★☆☆ 6.46 (114597)<br><br>Physical therapist Kim Dan has been down on his luck for as long as he can remember. Between an ailing grandmother, menacing loansharks, and an old boss making it almost impossible for him to find work, Dan is truly running out of options. Naturally, it feels like a dream come true when he’s finally hired to treat top-paid MMA fighter Joo Jaekyung, especially when the man then calls him out for a treatment the night before a match with an oh-so-tantalizing offer of five thousand dollars. He claims to have a “jinx” in need of a particular type of “treatment," but it's one that Dan isn't quite prepared to offer… You see, Jaekyung may be a beast in the ring, but he’s even rougher in the bedroom, and Dan’s not sure he can survive Jaekyung at his most primal. Nevertheless, the promise of much-needed cash has Dan agreeing to this ill-fated deal... Could a night together be the thing to help Jaekyung break this jinx once and for all?<br><br>**Alternative Names:**<br>- 징크스 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 111 chapters |  |  |  |
| chapter dates | PASS | 111 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 98 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | UNUSUAL | popular: `https://aovheroes.com/.../rdsd <redacted query values: data>` to `https://5v5world.co/.../rdsd <redacted query values: data>` (1 redirects) |  |  |  |
| page load | PASS | `https://2.bp.blogspot.com/.../AJQWtBMSwG7mpW63y-6JzSMVkxIF-tYze0_K0tQC6HCE0aZEyl1Dmv6b2w9VRrosWQwBL4OYKpXvFu93JeG6cd_a8aJbuP4aRR3lFbXqJY2PGvycNgK9Hg=w700` (image/jpeg, 97431 bytes, 700x1127) |  |  |  |
