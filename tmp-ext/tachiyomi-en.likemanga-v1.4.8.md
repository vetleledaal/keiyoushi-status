# Extension Validation Report

- Extension: tachiyomi-en.likemanga-v1.4.8
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 34
- Lint: 2
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 6236979603959140497
- Source name: LikeManga
- Source language: en
- Selected manga input: latest offset 0: The Ultimate Wantless Godly Rich System (`.../the-ultimate-wantless-godly-rich-system-28767`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 36 | Revenge of the Baskerville Bloodhound (`.../revenge-of-the-baskerville-bloodhound-3573`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 36 | Pick Me Up (`.../pick-me-up-2515`) |  | 10s+ |
| latest | `fetchLatestUpdates(1)` | success | 36 | The Ultimate Wantless Godly Rich System (`.../the-ultimate-wantless-godly-rich-system-28767`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 36 | I'm a Villainess, but I Won't Live Like One (`.../i39;m-a-villainess-but-i-won39;t-live-like-one-34116`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | The Ultimate Wantless Godly Rich System (`.../the-ultimate-wantless-godly-rich-system-28767`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | The Ultimate Wantless Godly Rich System (`.../the-ultimate-wantless-godly-rich-system-28767`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 85 | Chapter 1 (`.../chapter-1-1324460`) |  | 10s+ |
| pages | `fetchPageList(chapter)` | success | 42 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=The Ultimate Wantless Godly Rich System, URL=`.../the-ultimate-wantless-godly-rich-system-28767` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 145/145 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 145/145 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://likemanga.ink/.../1721567223-669d07f729852-theultimatewantlessgodlyrichsystem.webp` (image/webp (encoding: lossy), 650590 bytes, 2480x3508) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../the-ultimate-wantless-godly-rich-system-28767` |  |  |  |
| details thumbnail URL | PASS | `https://likemanga.ink/.../1721567223-669d07f729852-theultimatewantlessgodlyrichsystem.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Game, Shounen, Slice of Life |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Hang Xingwang, who had been silently enduring life as a corporate slave, suddenly awakened the Ultimate Freedom System. The more he indulges, the richer he becomes! From then on, the lowly operations staff transforms into the top boss, stepping on simps and punching snobs in the face. Thus begins his journey as a godly tycoon! |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 85 chapters |  |  |  |
| chapter dates | LINT | 5 of 85 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=5 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 42 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://like.mgread.io/.../1.jpg` (image/jpeg, 304395 bytes, 1000x1778) |  |  |  |
