# Extension Validation Report

- Extension: tachiyomi-fr.furyosquad-v1.4.5
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
- Passed: 28
- Lint: 3
- Warnings: 2
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
- Selected manga input: latest offset 0: GANGKING (`.../gangking`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 37 | A-BOUT! (`.../about`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 8 | GANGKING (`.../gangking`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | GANGKING (`.../gangking`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | GANGKING (`.../gangking`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 135 | Vol.1 Chapitre 1: Marque des Héros (`.../1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 28 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=GANGKING, URL=`.../gangking` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 46/46 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 46/46 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `https://www.furyosociety.com/.../mangas` -> 4 manga URLs (examples: `.../a-bout`, `.../dustland`, `.../kyo-kara-ore-wa`), `https://www.furyosociety.com` -> 4 manga URLs (examples: `.../shonan-bakusozoku`, `.../kyo-kara-ore-wa`, `.../dustland`) |  |  |  |
| thumbnail | PASS | `https://www.furyosociety.com/.../square_icon_GANGKING.jpg` (image/jpeg, 104822 bytes, 800x800) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../gangking` |  |  |  |
| details thumbnail URL | UNUSUAL | Differs from selected listing thumbnail; `https://www.furyosociety.com/.../cover_61K4udGkr9L.jpg` (image/jpeg, 159492 bytes, 560x800) |  |  |  |
| details author | PASS | Yanauchi Daiju |  |  |  |
| details artist | PASS | Yanauchi Daiju |  |  |  |
| details genres | PASS | Furyō |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | Jimmy, 16 ans, n'a qu'un rêve : économiser et partir aux USA retrouver son héros qui lui a autrefois sauvé la vie, afin de devenir le plus grand Maître de Tatouage au Monde. Jimmy, chien fou et rebelle, est réputé pour s'être gravé lui-même sur le corps un immense tatouage… pour lequel il reçoit son surnom de Jimmy le Tatoué. Tête brûlée, c'est avec ses potes qu'il mène sa vie au lycée entre bagarres et tatouages. |  |  |  |
| metadata trimming | LINT | Untrimmed fields: chapter 27 name |  |  |  |
| chapters | PASS | 135 chapters |  |  |  |
| chapter dates | LINT | 19 of 135 chapters lack a usable source upload timestamp: -136012140000 (unexpected negative value)=19 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 28 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.furyosociety.com/.../000-GangKingcredits-2018B.jpg` (image/jpeg, 636430 bytes, 794x1200) |  |  |  |
