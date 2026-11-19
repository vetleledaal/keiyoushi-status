# Extension Validation Report

- Extension: tachiyomi-en.hentaireadio-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 1055804712296309124
- Source name: HentaiRead.io
- Source language: en
- Selected manga input: popular offset 0: Your Mom Is the Best (`.../your-mom-is-the-best-58888`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 37 | Your Mom Is the Best (`.../your-mom-is-the-best-58888`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 37 | Siblings having sex in the living room like it's normal (`.../siblings-having-sex-in-the-living-room-like-it39;s-normal-50009`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 37 | An Idol Manager's Diary (`.../an-idol-manager39;s-diary-60440`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 37 | Onaho's Rapist Rape ~The Granddaughter Of The Chairman Who Joined The Company Is Super Cheeky, So I Decided To Make Her Know She's A Fucking Slut (`.../onaho39;s-rapist-rape-~the-granddaughter-of-the-chairman-who-joined-the-company-is-super-cheeky-so-i-decided-to-make-her-know-she39;s-a-fucking-slut-61160`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 2 | Your Mom Is the Best (`.../your-mom-is-the-best-58888`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | Your Mom Is the Best (`.../your-mom-is-the-best-58888`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 19 | Chapter 1 (`.../chapter-1-161129`) |  | <1s |
| pages | `getPageList(chapter)` | success | 14 |  |  | <1s |

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
| popular listing | PASS | 37 entries |  |  |  |
| latest listing | PASS | 37 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Your Mom Is the Best, URL=`.../your-mom-is-the-best-58888` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | FAIL | Popular page 1 repeats 1 manga entry: title=Your Mom Is the Best, URL=`.../your-mom-is-the-best-58888`; Popular page 2 repeats 1 manga entry: title=Siblings having sex in the living room like it's normal, URL=`.../siblings-having-sex-in-the-living-room-like-it39;s-normal-50009`; Latest page 1 repeats 1 manga entry: title=An Idol Manager's Diary, URL=`.../an-idol-manager39;s-diary-60440`; Latest page 2 repeats 1 manga entry: title=Onaho's Rapist Rape ~The Granddaughter Of The Chairman Who Joined The Company Is Super Cheeky, So I Decided To Make Her Know She's A Fucking Slut, URL=`.../onaho39;s-rapist-rape-~the-granddaughter-of-the-chairman-who-joined-the-company-is-super-cheeky-so-i-decided-to-make-her-know-she39;s-a-fucking-slut-61160` | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 150/150 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 150/150 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://hentairead.io/.../1788007919-6a92d5efed4c4-yourmomisthebestm.jpg` (image/jpeg, 62126 bytes, 250x320) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../your-mom-is-the-best-58888` |  |  |  |
| details thumbnail URL | PASS | `https://hentairead.io/.../1788007919-6a92d5efed4c4-yourmomisthebestm.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Drama, Harem, Manhwa, Mature |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | A story about a childhood friend, who’s a forum admin, and her mother, who worries about her. The protagonist ends up tangled in a strange love triangle with the beautiful mother and her daughter. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 19 chapters |  |  |  |
| chapter dates | PASS | 19 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-ht.hentairead.io/.../1.jpg` (image/jpeg, 2680992 bytes, 720x15110) |  |  |  |
