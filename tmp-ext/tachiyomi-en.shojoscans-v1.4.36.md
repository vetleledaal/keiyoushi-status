# Extension Validation Report

- Extension: tachiyomi-en.shojoscans-v1.4.36
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 9079184529211162476
- Source name: Violet Scans
- Source language: en
- Selected manga input: latest offset 0: Once an Assassin, Now a Royal Nanny (`.../once-an-assassin-now-a-royal-nanny`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | I’ll Be The Matriarch In This Life (`.../ill-be-the-matriarch-in-this-life`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 30 | A Saint Who Was Adopted by the Grand Duke (`.../a-saint-who-was-adopted-by-the-grand-duke`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 30 | Once an Assassin, Now a Royal Nanny (`.../once-an-assassin-now-a-royal-nanny`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 30 | The Lady Wants to Hide Her Zombie Family (`.../the-lady-wants-to-hide-her-zombie-brothers`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Once an Assassin, Now a Royal Nanny (`.../once-an-assassin-now-a-royal-nanny`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Once an Assassin, Now a Royal Nanny (`.../once-an-assassin-now-a-royal-nanny`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 34 | Chapter 1 (`.../once-an-assassin-now-a-royal-nanny-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 27 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Once an Assassin, Now a Royal Nanny, URL=`.../once-an-assassin-now-a-royal-nanny` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 121/121 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 121/121 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://violetscans.org/.../2026-06-18-01-57-51-1781791071737-210x300.png` (image/png, 123438 bytes, 210x300) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../once-an-assassin-now-a-royal-nanny` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://violetscans.org/.../2026-06-18-01-57-51-1781791071737.png` (image/png, 1276009 bytes, 720x1030) |  |  |  |
| details author | PASS | tt studio |  |  |  |
| details artist | PASS | Rolock |  |  |  |
| details genres | PASS | Fantasy, Romance, Royalty, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | A year after her lover stabs her in the back, legendary assassin Kyla Angel wakes up in the body of Rachel Brown, a nanny tasked with caring for a neglected prince and princess. Knowing the man who betrayed her is still out there, Kyla must bide her time before she can sneak out of the palace and get revenge. But in the meantime, she must face her deadliest challenge yet: childcare. Now it’s up to Kyla to figure out how to soothe a crying toddler with hands meant for throwing daggers and slitting throats…<br><br>Alternative Names:<br>- 황자의 보모<br>- 특기는 암살입니다<br>- The Crown Prince's Nanny Is an Assassin |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 34 chapters |  |  |  |
| chapter dates | PASS | 34 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 27 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://violetscans.org/.../2026-06-13-12-07-20-1781309240362.webp` (image/webp (encoding: lossy), 343590 bytes, 1080x7155) |  |  |  |
