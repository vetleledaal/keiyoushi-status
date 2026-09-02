# Extension Validation Report

- Extension: tachiyomi-all.projectsuki-v1.4.9
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 33
- Lint: 1
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 8965918600406781666
- Source name: Project Suki
- Source language: all
- Selected manga input: popular offset 0: "Nobukuni-San" Does She Likes Me? (`.../200170`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 30 | "Nobukuni-San" Does She Likes Me? (`.../200170`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 30 | Burial Sword Art (`.../202342`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 41 | The S-Classes That I Raised (`.../207906`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 9 | "Nobukuni-San" Does She Likes Me? (`.../200170`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | "Nobukuni-San" Does She Likes Me? (`.../200170`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 36 | Chapter 1 (`.../1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 15 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | PASS |  |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 30 entries |  |  |  |
| latest listing | PASS | 41 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title="Nobukuni-San" Does She Likes Me?, URL=`.../200170` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 110/110 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 110/110 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://projectsuki.com/.../thumb.jpeg` (image/jpeg, 1813694 bytes, 1801x2560) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../200170` |  |  |  |
| details thumbnail URL | PASS | `https://projectsuki.com/.../thumb.jpeg` |  |  |  |
| details author | PASS | YASUDA Kousuke |  |  |  |
| details artist | PASS | YASUDA Kousuke |  |  |  |
| details genres | PASS | Comedy, Ecchi, Romance, School Life, Seinen, Slice of Life, Manga |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | In the countryside of Hiroshima, there is a girl who, against all odds, realizes that she is in love with her beloved Sasaki-Kun. Blessed with the opportunity to be sitting next to her crush, she attempts to seduce him with the guidance of the god of teenage love! Meeko-sama! This is the story of a young teen figuring out what it means to be in love and the art of seduction.<br><br>.../=<br><br>Alt titles:  I Get The Feeling That Nobukuni-San Likes Me, Tonari no Nobukuni-san wa Ore no Koto ga Suki na Ki ga Suru, Tonari no Nobukuni-san wa Ore no Koto ga Sukina Ki ga Suru, となりの信國さんは俺のことが好きな気がする<br>Authors:  YASUDA Kousuke<br>Artists:  YASUDA Kousuke<br>Status:  Ongoing<br>Origin:  Japan<br>Release year:  2020<br>User rating:  ?.../5<br>Views:  5958<br>Purchase:  Amazon<br>Genres:  Comedy, Ecchi, Romance, School Life, Seinen, Slice of Life, Manga<br> |  |  |  |
| metadata trimming | LINT | Untrimmed fields: description |  |  |  |
| chapters | PASS | 36 chapters |  |  |  |
| chapter dates | PASS | 36 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 15 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://projectsuki.com/.../001 <redacted query values: 1686301994>` (image/jpeg, 352329 bytes, 1433x918) |  |  |  |
