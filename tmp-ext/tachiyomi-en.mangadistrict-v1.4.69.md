# Extension Validation Report

- Extension: tachiyomi-en.mangadistrict-v1.4.69
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: madaralegacy
- Source ID: 2964723819258267786
- Source name: Manga District
- Source language: en
- Selected manga input: latest offset 0: Becoming Alpha (Uncensored) (`.../becoming-alpha-uncensored`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | Teach Me first! (Uncensored) (`.../teach-me-first-uncensored`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 30 | The Landlord’s Sister (`.../the-landlords-sister`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Becoming Alpha (Uncensored) (`.../becoming-alpha-uncensored`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | MBB (My Bad Boss) (Uncensored) (`.../mbb-my-bad-boss-uncensored`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Becoming Alpha (Uncensored) (`.../becoming-alpha-uncensored`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Becoming Alpha (Uncensored) (`.../becoming-alpha-uncensored`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 6 | Chapter 0 - Prologue (`https://mangadistrict.com/.../chapter-0 <redacted query values: style>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 5 |  |  | 1-10s |

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
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 30 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Becoming Alpha (Uncensored), URL=`.../becoming-alpha-uncensored` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn.mangadistrict.com/.../becoming-alpha-uncensored-official.webp` (image/webp (encoding: lossless), 153654 bytes, 400x593) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../becoming-alpha-uncensored` |  |  |  |
| details thumbnail URL | PASS | `https://cdn.mangadistrict.com/.../becoming-alpha-uncensored-official.webp` |  |  |  |
| details author | PASS | Dream Invader, Furuikashi |  |  |  |
| details artist | PASS | Dream Invader, Furuikashi |  |  |  |
| details genres | PASS | Borderline H, Drama, Explicit Sex, Full Color, Incest, OEL, Uncensored, Webtoons, Bathhouse, Big Breasts, Domination, Dysfunctional Families, Forbidden Love, Infidelity, Love Triangle, Mansion, Married Life, Muscle, NTR, Obsessive Love, Public Sex, Secret Affair, Secret Relationship, Sexually Frustrated, Step Family, Stepmom, Stepmother, Voyeurism, Yoga, OEL, Webtoons |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Becoming Alpha (Uncensored)<br><br>Patrick spent his life under his mother’s thumb, unable to master his urges around women. To fix him, his father Roman teaches him the alpha way: Respect the Cock. But the lessons work too well when Patrick targets Jen, his father’s alluring young wife. A dangerous affair begins, and when Roman finds out, all hell breaks loose. Will Patrick survive his father’s wrath? Discover the shocking climax in the pages of Becoming Alpha. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 6 chapters |  |  |  |
| chapter dates | PASS | 6 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | UNUSUAL | All 6 chapter URLs are absolute |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 5 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn.mangadistrict.com/.../01.jpg` (image/jpeg, 1206022 bytes, 1440x10000) |  |  |  |
