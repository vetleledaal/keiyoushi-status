# Extension Validation Report

- Extension: tachiyomi-en.mangack-v1.4.2
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7208855238528281651
- Source name: Mangack
- Source language: en
- Selected manga input: latest offset 0: Overlord of Insects (`.../overlord-of-insects`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Emperor of Steel (`.../emperor-of-steel`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Frozen Apocalypse: No Chance of Survival (`.../frozen-apocalypse-no-chance-of-survival`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 60 | Overlord of Insects (`.../overlord-of-insects`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 60 | Youngest Scion of the Mages (`.../youngest-scion-of-the-mages`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Overlord of Insects (`.../overlord-of-insects`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Overlord of Insects (`.../overlord-of-insects`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 128 | CHAPTER 1 (`.../overlord-of-insects-chapter-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 26 |  |  | 1-10s |

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
| latest listing | PASS | 60 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Overlord of Insects, URL=`.../overlord-of-insects` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 169/169 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 169/169 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://mangack.com/.../Overlord-of-Insects.webp` (image/webp (encoding: lossy), 34116 bytes, 600x855) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../overlord-of-insects` |  |  |  |
| details thumbnail URL | PASS | `https://mangack.com/.../Overlord-of-Insects.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Action, Adventure, Drama, Fantasy, Martial Arts, Manhua |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Having been transported into a world where everyone is a Job-Changer, Jiang Chen awakened the Insect Domination System! The little insects can evolve, attack, and extract talents! Most importantly, they can breed invincible natural disasters! Overlord of Insects<br><br>Alternative: Overlord of Insects<br><br>Year: 2024<br><br>Followers: 65<br><br>Views: 270K |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 128 chapters |  |  |  |
| chapter dates | PASS | 128 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 26 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn.black-clover.org/.../1.webp` (image/webp (encoding: lossy), 182304 bytes, 800x3420) |  |  |  |
