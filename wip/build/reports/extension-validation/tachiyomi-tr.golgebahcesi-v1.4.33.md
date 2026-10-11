# Extension Validation Report

- Extension: tachiyomi-tr.golgebahcesi-v1.4.33
- Input artifact: JAR
- Generated at: 2026-10-11T12:00:00Z
- Commit: 03889d89f590075d3f02c0584b82a2f56c358d37
- Passed: 36
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 7442439989890509521
- Source name: Gölge Bahçesi
- Source language: tr
- Selected manga input: latest offset 0: Çöküşten Sonra (`.../cokusten-sonra`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 24 | Gölgelerdeki Hükümdar Olmak İstiyorum (`.../golgelerdeki-hukumdar-olmak-istiyorum`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 24 | Büyücü Çoban (`.../buyucu-coban`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 24 | Çöküşten Sonra (`.../cokusten-sonra`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 24 | Sıra Arkadaşımın Sırrı (`.../sira-arkadasimin-sirri`) |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Çöküşten Sonra (`.../cokusten-sonra`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Çöküşten Sonra (`.../cokusten-sonra`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 113 | Bölüm 1 (`.../chapter-1`) |  | <1s |
| pages | `fetchPageList(chapter)` | success | 49 |  |  | <1s |

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
| latest listing | PASS | 24 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Çöküşten Sonra, URL=`cokusten-sonra` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 97/97 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 97/97 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://c2.skycdn.online/.../1791601035_77d084cea84ddcf423d993211e512411.webp` (image/webp (encoding: lossy), 446180 bytes, 1101x1428) |  |  |  |
| details identity | PASS | Details preserved selected URL `cokusten-sonra` |  |  |  |
| details thumbnail URL | PASS | `https://c2.skycdn.online/.../1791601035_77d084cea84ddcf423d993211e512411.webp` |  |  |  |
| details author | PASS | Song |  |  |  |
| details artist | PASS | Song |  |  |  |
| details genres | PASS | Aksiyon, Fantastik, Dram, Manhwa |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Bir çocuk, babası tarafından bodruma hapsedilir ve hayatı boyunca burada eğitilir. Onu bodruma kapatan akıl sağlığı bozuk babası bir gün, “Kıyamet geliyor,” der.<br>Yıllar süren eğitimi boyunca hayatta kalma becerilerini geliştiren çocuk, artık yaklaşan kıyametten sağ çıkmak zorundadır. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 113 chapters |  |  |  |
| chapter dates | LINT | All 113 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=113 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 49 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://c2.skycdn.online/.../1.png` (image/png, 525707 bytes, 1062x687) |  |  |  |
