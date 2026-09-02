# Extension Validation Report

- Extension: tachiyomi-all.namicomi-v1.4.6
- Input artifact: JAR
- Generated at: 2026-09-02T13:00:00Z
- Commit: 8d1dc64be4c145b933270346bff95970a4b63d56
- Passed: 36
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.a
- Source ID: 6815287454679474132
- Source name: NamiComi
- Source language: en
- Selected manga input: latest offset 0: Tale of the Tape (`.../aqBADtcz`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Falling in Love With My Ex-Fiance's Grandfather (`.../73hLs8EN`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 20 | Lovestuck (`.../Eim3NGBU`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Tale of the Tape (`.../aqBADtcz`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 20 | A little bit of everything (`.../jNivq9Rd`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 2 | Tale of the Tape (`.../aqBADtcz`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Tale of the Tape (`.../aqBADtcz`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 2 | Ep. 1 - The First Round (Intro P1) (`.../qAbvLL85`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 199 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Tale of the Tape, URL=`aqBADtcz` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 82/82 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 82/82 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://uploads.namicomi.com/.../d4f56289-77ff-4d7d-9fdb-b4f27b63f783.png` (image/png, 2550761 bytes, 1428x2000) |  |  |  |
| details identity | PASS | Details preserved selected URL `aqBADtcz` |  |  |  |
| details thumbnail URL | PASS | `https://uploads.namicomi.com/.../d4f56289-77ff-4d7d-9fdb-b4f27b63f783.png` |  |  |  |
| details author | PASS | Angel Tovar |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Full Color, Action, Sports, Martial Arts, School Life, English |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | After a boxing suspension, Neil must pay a steep fine. He partners with a misfit team in a high-stakes MMA tournament, and his unexpected talent surprises everyone. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 2 chapters |  |  |  |
| chapter dates | PASS | 2 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 199 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://uploads.namicomi.com/.../1-6d6fb3966db708a02507a1b392812c3361c1f6daaf7f6d9aae1d50e28a19a819.jpg` (image/jpeg, 31498 bytes, 800x640) |  |  |  |
