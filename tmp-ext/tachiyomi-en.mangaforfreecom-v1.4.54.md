# Extension Validation Report

- Extension: tachiyomi-en.mangaforfreecom-v1.4.54
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 35
- Lint: 0
- Warnings: 2
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 1099222169691387069
- Source name: Mangaforfree.com
- Source language: en
- Selected manga input: latest offset 0: Protect You (`.../protect-you`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Secret Class (`.../secret-class-39`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Hypnotic Security Guard (`.../hypnotic-security-guard`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Protect You (`.../protect-you`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | Love Quest (`.../love-quest`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 5 | Protect You (`.../protect-you`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Protect You (`.../protect-you`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 61 | Chapter 1 (`https://mangaforfree.com/.../chapter-1 <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 20 |  |  | <1s |

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
| popular listing | PASS | 20 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Protect You, URL=`.../protect-you` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 85/85 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 85/85 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangaforfree.com/.../Protect-You-manga-free-175x238.jpg` (image/jpeg, 10391 bytes, 175x238) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../protect-you` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://mangaforfree.com/.../Protect-You-manga-free-193x278.jpg` (image/jpeg, 12686 bytes, 193x278) |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Drama, Ecchi, Manhwa, Mature, Romance |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | “I didn’t know… how heavy and cruel the responsibility of protecting is.” For me, who grew up with an absent father who said “I’ll protect you,” and an unfaithful mother, that phrase was pure hatred. Who would have imagined that I would say those words… and not to just anyone, but to the daughter of the murderer who killed my father?<br><br>Alternative Names: 지켜줄게, I Will Protect You |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 61 chapters |  |  |  |
| chapter dates | PASS | 61 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 61 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 20 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://mangaforfree.com/.../1.jpg` (image/jpeg, 425409 bytes, 720x14219) |  |  |  |
