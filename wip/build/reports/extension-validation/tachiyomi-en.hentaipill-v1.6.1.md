# Extension Validation Report

- Extension: tachiyomi-en.hentaipill-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 35
- Lint: 0
- Warnings: 0
- Skipped: 2
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 5744141040135150417
- Source name: HentaiPill
- Source language: en
- Selected manga input: popular offset 0: [Takayuki Hiyori] Aiyoku Gensou no Kai -Cthulhu Pregnant- [English] [Seyzer Koze, ChoriScans] (`.../g117376`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 50 | [Takayuki Hiyori] Aiyoku Gensou no Kai -Cthulhu Pregnant- [English] [Seyzer Koze, ChoriScans] (`.../g117376`) |  | <1s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | [Wishroll] My Bigger Half (Black & White) (`.../g137309`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | [HAZEL-NUTS-STUDIO (Kani Natsu)] Kodoku o Magirawasu Tame ni Hatsujou Shite mo Ii kashira / Can I Go In Heat To Stave Off My Loneliness? (Blue Archive) [Digital] [English] {Doujins.com} (`.../g137035`) |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | [Takayuki Hiyori] Aiyoku Gensou no Kai -Cthulhu Pregnant- [English] [Seyzer Koze, ChoriScans] (`.../g117376`) |  | <1s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [Takayuki Hiyori] Aiyoku Gensou no Kai -Cthulhu Pregnant- [English] [Seyzer Koze, ChoriScans] (`.../g117376`) |  | <1s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../g117376`) |  | <1s |
| pages | `getPageList(chapter)` | success | 190 |  |  | <1s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | PASS |  |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 50 entries |  |  |  |
| latest listing | PASS | 20 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[Takayuki Hiyori\] Aiyoku Gensou no Kai -Cthulhu Pregnant- \[English\] \[Seyzer Koze, ChoriScans\], URL=`g117376` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 91/91 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 91/91 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://b1.hentaipill.com/.../491469-thumb.jpg` (image/jpeg, 48150 bytes, 500x213) |  |  |  |
| details identity | PASS | Details preserved selected URL `g117376` |  |  |  |
| details thumbnail URL | PASS | `https://b1.hentaipill.com/.../491469-thumb.jpg` |  |  |  |
| details author | PASS | takayuki hiyori |  |  |  |
| details artist | PASS | takayuki hiyori |  |  |  |
| details genres | PASS | anal (female), big breasts (female), big penis (male), birth (female), blindfold (female), blindfold (male), blowjob (female), bondage (female), bondage (male), breast expansion (female), catgirl, collar (female), dark skin (female), daughter, defloration, double penetration (female), eggs (female), femdom, ffm threesome, gag (male), gloves (female), group, harem (female), harem (male), harness (female), harpy (female), horns (female), human cattle (female), impregnation (female), incest, inflation (female), kemonomimi (female), kemonomimi (male), kimono (female), lactation (female), large tattoo (female), lizard girl, masked face (male), mind break (female), mmf threesome, monster (male), monster girl (female), multiple paizuri, nakadashi (female), nipple fuck (female), oyakodon (female), pig man, possession (female), pregnant (female), prostitution (female), rape (female), snuff (male), sweating (female), tail (female), tankoubon, tentacles (female), thigh high boots (female), transformation (female), transformation (male), triple penetration (female), x-ray (female), zombie (male) |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | Parodies: cthulhu mythos |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 190 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://b1.hentaipill.com/.../491469-1.jpg` (image/jpeg, 240078 bytes, 1280x545) |  |  |  |
