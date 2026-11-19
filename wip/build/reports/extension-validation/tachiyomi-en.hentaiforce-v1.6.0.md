# Extension Validation Report

- Extension: tachiyomi-en.hentaiforce-v1.6.0
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 36
- Lint: 0
- Warnings: 1
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3523945650915299214
- Source name: HentaiForce
- Source language: en
- Selected manga input: popular offset 0: [Jay R. Naylor] The Fall Of Little Red Riding Hood (Ch.1-4) Full color {color enhanced by: Necrotechian} (`.../138131`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 20 | [Jay R. Naylor] The Fall Of Little Red Riding Hood (Ch.1-4) Full color {color enhanced by: Necrotechian} (`.../138131`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 20 | [alansmithee] Tekken Seisai Stopman | Stopman The Iron-Fist of Justice [English] {doujin-moe.us} (`.../228035`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 20 | [Sakamata Nerimono] HYPNO BLINK Ver.1.0 [English] [Digital] (`.../750167`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 20 | [Tao Yoharu] 【セリフ有り無し+服なしver】星街す○せい (`.../750098`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | [Jay R. Naylor] The Fall Of Little Red Riding Hood (Ch.1-4) Full color {color enhanced by: Necrotechian} (`.../138131`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | [Jay R. Naylor] The Fall Of Little Red Riding Hood (Ch.1-4) Full color {color enhanced by: Necrotechian} (`.../138131`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 1 | Chapter (`.../138131`) |  | <1s |
| pages | `getPageList(chapter)` | success | 62 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=\[Jay R. Naylor\] The Fall Of Little Red Riding Hood (Ch.1-4) Full color {color enhanced by: Necrotechian}, URL=`138131` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | UNUSUAL | Overlapping manga: title=\[Tao Yoharu\] 【セリフ有り無し+服なしver】星街す○せい, URL=`750098` at page 1 offset 19 and page 2 offset 0 |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 81/81 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 81/81 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://m1.hentaiforce.net/.../795560-cover.jpg` (image/jpeg, 136840 bytes, 700x933) |  |  |  |
| details identity | PASS | Details preserved selected URL `138131` |  |  |  |
| details thumbnail URL | PASS | `https://m1.hentaiforce.net/.../795560-cover.jpg` |  |  |  |
| details author | PASS | jay naylor |  |  |  |
| details artist | PASS | jay naylor |  |  |  |
| details genres | PASS | comic, anal (female), blowjob (female), breast expansion (male), cheating (female), compilation, crotch tattoo (female), deepthroat (female), drugs (female), facesitting (male), feminization, freckles (female), full color, furry (female), furry (male), gender bender (male), gloves (female), group, hairy (female), huge breasts (male), human on furry (female), impregnation (female), large tattoo (female), mind break (female), multi-work series, netorare (female), pregnant (female), rape (female), retractable penis (male), rimjob (female), shemale (female), story arc, twintails (female), very long hair (female), wolf boy, x-ray (female) |  |  |  |
| details status | PASS | COMPLETED (2) |  |  |  |
| details description | PASS | **Parodies:** little red riding hood · **Characters:** little red riding hood · **Languages:** english · **Pages:** 62 |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 1 chapters |  |  |  |
| chapter dates | PASS | 1 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 62 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://m1.hentaiforce.net/.../795560-1.jpg` (image/jpeg, 128645 bytes, 648x864) |  |  |  |
