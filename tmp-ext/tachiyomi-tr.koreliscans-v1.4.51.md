# Extension Validation Report

- Extension: tachiyomi-tr.koreliscans-v1.4.51
- Input artifact: JAR
- Generated at: 2026-09-09T17:00:00Z
- Commit: 44be8e7da1b81ac2ecf84d1b7af301d7d4e1790f
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
- Source theme: mangathemesia
- Source ID: 1475942648540931708
- Source name: Koreli Scans
- Source language: tr
- Selected manga input: latest offset 0: Mutlak Büyücü (`.../mutlak-buyucu`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Lookism (`.../lookism`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 10 | Zirve Seviye Çaylak (`.../zirve-seviye-caylak`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 10 | Mutlak Büyücü (`.../mutlak-buyucu`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 10 | Köpek Köpeği Isırır (`.../kopek-kopegi-isirir`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Mutlak Büyücü (`.../mutlak-buyucu`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Mutlak Büyücü (`.../mutlak-buyucu`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 185 | Bölüm 1 (`.../mutlak-buyucu-bolum-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 14 |  |  | 10s+ |

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
| popular listing | PASS | 10 entries |  |  |  |
| latest listing | PASS | 10 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Mutlak Büyücü, URL=`.../mutlak-buyucu` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://image.nabicix.com/.../Mutlak-Buyucu.webp` (image/webp (encoding: lossy), 28340 bytes, 432x618) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../mutlak-buyucu` |  |  |  |
| details thumbnail URL | PASS | `https://image.nabicix.com/.../Mutlak-Buyucu.webp` |  |  |  |
| details author | PASS | Kim Chiwoo |  |  |  |
| details artist | PASS | Redice Studio |  |  |  |
| details genres | PASS | Aksiyon, Doğaüstü, Fantastik, Macera, Manhwa, Shounen |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Doğumdan sonra bir köşeye bırakılan Shirone avam bir çift tarafından büyütüldü. Daha küçükken kavrama yeteneği elde etti ve okumayı öğrendi. Şehre indikten sonra çok merak ettiği büyünün nasıl yapılacağını gördü. Böylece Shirone bir büyücü olma isteği körüklendi. Ancak şehir tamamen hiyerarşiden dolayı yozlaşmış bir halde. Daha büyümeden dünyanın acı gerçeklerini burada öğrendi. Shirone acaba büyücü olabilecek mi?<br><br>Alternative Names: 무한의 마법사 , Infinite Mage |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 185 chapters |  |  |  |
| chapter dates | LINT | All 185 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=185 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 14 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://www.nabicix.com/.../001_01.webp` (image/webp (encoding: lossy), 752576 bytes, 760x16383) |  |  |  |
