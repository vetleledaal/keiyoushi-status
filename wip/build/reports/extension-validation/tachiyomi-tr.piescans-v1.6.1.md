# Extension Validation Report

- Extension: tachiyomi-tr.piescans-v1.6.1
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 37
- Lint: 0
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7253944895138761719
- Source name: Piescans
- Source language: tr
- Selected manga input: popular offset 0: A Fortune-Telling Princess (`.../a-fortune-telling-princess`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 30 | A Fortune-Telling Princess (`.../a-fortune-telling-princess`) |  | <1s |
| popular_next | `getPopularManga(2)` | success | 30 | Don’t Mind Me, Daddy (`.../dont-mind-me-daddy`) |  | <1s |
| latest | `getLatestUpdates(1)` | success | 15 | Barbarian’s Adventure in a Fantasy World (`.../barbarians-adventure-in-a-fantasy-world`) |  | <1s |
| latest_next | `getLatestUpdates(2)` | success | 15 | The Shepherd Wizard (`.../the-shepherd-wizard`) |  | 1-10s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | A Fortune-Telling Princess (`.../a-fortune-telling-princess`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | A Fortune-Telling Princess (`.../a-fortune-telling-princess`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 179 | Bölüm 0 (`.../a-fortune-telling-princess-bolum-0`) |  | <1s |
| pages | `getPageList(chapter)` | success | 4 |  |  | <1s |

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
| latest listing | PASS | 15 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=A Fortune-Telling Princess, URL=`.../a-fortune-telling-princess` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 91/91 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 91/91 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://piescans.com/.../resource.webp` (image/webp (encoding: lossy), 144234 bytes, 720x1030) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../a-fortune-telling-princess` |  |  |  |
| details thumbnail URL | PASS | `https://piescans.com/.../resource.webp` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Manhwa, Dram, Fantastik, Romantizm, Shoujo |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | ★★★★★ 10<br><br>Oyuncu Lee Sia, yıllardır sadece hayaletler tarafından rahatsız edilmekle kalmamış, aynı zamanda sürekli üvey babası ve üvey abisi tarafından öldürülen Camilla Sorphel adlı bir kızın rüyalarıyla da boğuşmaktadır. Rüyaları görmezden gelmeye çalışsa da, iş yerinde geçirdiği bir kaza ardından Camilla olarak uyanır. Ailesinin sevgisini kazanmak ve öldürülmekten kaçmak için birçok hayaletten yardım istemek zorunda kalmıştır. Bakalım bu eski oyuncu gelecekteki katillerine karşı sevgi dolu bir evlat ve kız kardeş rolünü oynayabilecek mi? |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 179 chapters |  |  |  |
| chapter dates | PASS | 179 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 4 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://piescans.com/.../00.jpg` (image/jpeg, 223828 bytes, 1920x1080) |  |  |  |
