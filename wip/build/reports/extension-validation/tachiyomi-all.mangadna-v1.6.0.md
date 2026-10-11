# Extension Validation Report

- Extension: tachiyomi-all.mangadna-v1.6.0
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 30e9bf12769926b1fd7fafc4247779e7a44f2fbf+dirty
- Passed: 34
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 5181311401760417052
- Source name: MangaDNA
- Source language: en
- Selected manga input: popular offset 0: Dungeon Reset (`.../dungeon-reset`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 23 | Dungeon Reset (`.../dungeon-reset`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 22 | The Dragon-Slaying Knight Longs For A Clean Slate After Kissing The Evil Dragon (`.../the-dragon-slaying-knight-longs-for-a-clean-slate-after-kissing-the-evil-dragon`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 16 | Mother’s Friends (`.../mothers-friends`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 22 | Friendzone Face-Off (`.../friendzone-face-off`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | Dungeon Reset (`.../dungeon-reset`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Dungeon Reset (`.../dungeon-reset`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 267 | Chapter 1 (`.../chapter-1`) |  | <1s |
| pages | `getPageList(chapter)` | success | 9 |  |  | 1-10s |

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
| popular listing | PASS | 23 entries |  |  |  |
| latest listing | PASS | 16 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Dungeon Reset, URL=`.../dungeon-reset` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | UNUSUAL | Overlapping manga: title=No to Obsession, Yes to Love, URL=`.../no-to-obsession-yes-to-love` at page 1 offset 5 and page 2 offset 5, title=Could the Boy Next Door be a Vampire?, URL=`.../could-the-boy-next-door-be-a-vampire` at page 1 offset 7 and page 2 offset 19, title=I Can’t Believe I Cum From Having My Nipples Teased…!, URL=`.../i-cant-believe-i-cum-from-having-my-nipples-teased` at page 1 offset 10 and page 2 offset 7, title=X Ash, URL=`.../x-ash` at page 1 offset 11 and page 2 offset 6, title=The You Who Descended Into The Universe, URL=`.../the-you-who-descended-into-the-universe` at page 1 offset 12 and page 2 offset 4, title=Asirhart Kingdom’s Aide, URL=`.../asirhart-kingdoms-aide` at page 1 offset 13 and page 2 offset 13, title=The Princess Covets the Scholar, URL=`.../the-princess-covets-the-scholar` at page 1 offset 14 and page 2 offset 21, title=The Dragon-Slaying Knight Longs For A Clean Slate After Kissing The Evil Dragon, URL=`.../the-dragon-slaying-knight-longs-for-a-clean-slate-after-kissing-the-evil-dragon` at page 1 offset 15 and page 2 offset 0, title=Insertion Into a Lewd Spot…!, URL=`.../insertion-into-a-lewd-spot` at page 1 offset 16 and page 2 offset 14, title=I Have Countless Legendary Swords, URL=`.../i-have-countless-legendary-swords` at page 1 offset 19 and page 2 offset 1 |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 84/84 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 84/84 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://mangadna.com` -> 16 manga URLs (examples: `.../please-marry-me-again-husband`, `.../see-you-in-my-19th-life`, `.../princess-please-distance-yourself-a-little`) |  |  |  |
| thumbnail | PASS | `https://mangadna.com/.../dungeon-reset-cover.jpg` (image/jpeg, 22164 bytes, 222x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../dungeon-reset` |  |  |  |
| details thumbnail URL | PASS | `https://mangadna.com/.../dungeon-reset-cover.jpg` |  |  |  |
| details author | PASS | Ant Studio, Daul |  |  |  |
| details artist | PASS | Ant Studio, Daul |  |  |  |
| details genres | PASS | Action, Adventure, Fantasy, Manhwa, RPG, Webtoon |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Once a Dungeon has been explored and its traps are activated, it resets itself for the next users. But those resets don’t apply to me?! Armed with absolute grin...<br><br>Alternative: 重启地下城, 던전 리셋<br><br>Rating: 68389.3 / 5 (133 votes) |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 267 chapters |  |  |  |
| chapter dates | PASS | 267 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | FAIL | Duplicate chapter URLs: `.../chapter-89` at offsets 177, 178 | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 9 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn01.mangadna.com/.../1-541.jpg` (image/jpeg, 113712 bytes, 720x973) |  |  |  |
