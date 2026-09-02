# Extension Validation Report

- Extension: tachiyomi-fr.furyosquad-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 28
- Lint: 3
- Warnings: 1
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 267710359229814456
- Source name: FuryoSquad
- Source language: fr
- Selected manga input: popular offset 0: A-BOUT! (`.../about`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 37 | A-BOUT! (`.../about`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 8 | SHONAN BAKUSOZOKU (`.../shonan-bakusozoku`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | A-BOUT! (`.../about`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | A-BOUT! (`.../about`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 166 | Vol.1 Chapitre 1: Opération  (`.../1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 68 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 37 entries |  |  |  |
| latest listing | PASS | 8 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A-BOUT!, URL=`.../about` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 47/47 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 47/47 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://www.furyosociety.com/.../mangas` -> 4 manga URLs (examples: `.../a-bout`, `.../dustland`, `.../kyo-kara-ore-wa`), `https://www.furyosociety.com` -> 4 manga URLs (examples: `.../shonan-bakusozoku`, `.../kyo-kara-ore-wa`, `.../dustland`) |  |  |  |
| thumbnail | PASS | `https://www.furyosociety.com/.../cover_B00BB1ZQD8.01_.S001_.LXXXXXXX_.png` (image/png, 1051757 bytes, 564x800) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../about` |  |  |  |
| details thumbnail URL | PASS | `https://www.furyosociety.com/.../cover_B00BB1ZQD8.01_.S001_.LXXXXXXX_.png` |  |  |  |
| details author | PASS | Ichikawa Masa |  |  |  |
| details artist | PASS | Ichikawa Masa |  |  |  |
| details genres | PASS | Furyo, Lycée |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Mitsumine est le lycée le plus dangereux du Japon, les factions des élèves de terminales le dirigent, mais c’était sans compter l’arrivée fracassante d’Asagiri. Ce nouvel élève va remettre les pendules à l'heure et buter tout le monde. Ça fera de lui l’homme à abattre, mais il ne se laissera pas faire, préparez-vous, ça va cogner. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 42 name, chapter 166 name |  |  |  |
| chapters | PASS | 166 chapters |  |  |  |
| chapter dates | LINT | 1 of 166 chapters lack a usable source upload timestamp: -136631580000 (unexpected negative value)=1 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 68 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://www.furyosociety.com/.../000.jpg` (image/jpeg, 206462 bytes, 794x1200) |  |  |  |
