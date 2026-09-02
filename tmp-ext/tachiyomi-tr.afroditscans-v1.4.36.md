# Extension Validation Report

- Extension: tachiyomi-tr.afroditscans-v1.4.36
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
- Source implementation: keiyoushi.source.Generated
- Source ID: 4839000923958753250
- Source name: Afrodit Scans
- Source language: tr
- Selected manga input: latest offset 0: Yapmamalıyız (`.../yapmamaliyiz`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 20 | Çocuğum İçin Dayanmalıyım! (`.../cocugum-icin-dayanmaliyim`) |  | <1s |
| popular_next | `fetchPopularManga(2)` | success | 17 | Canavar Prenses (`.../canavar-prenses`) |  | 1-10s |
| latest | `fetchLatestUpdates(1)` | success | 20 | Yapmamalıyız (`.../yapmamaliyiz`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | success | 17 | Kuzeyin Büyük Düşesi Gizli Bir Hain! (`.../kuzeyin-buyuk-dusesi-gizli-bir-hain`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Yapmamalıyız (`.../yapmamaliyiz`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Yapmamalıyız (`.../yapmamaliyiz`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 56 | Bölüm 0 (`.../0-bolum-oku`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 37 |  |  | <1s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Yapmamalıyız, URL=`.../yapmamaliyiz` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 75/75 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 75/75 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-a.efsaneler2.can.re/.../thumbnail.avif` (image/webp (encoding: lossy), 8568 bytes, 189x272; server Content-Type: image/avif) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../yapmamaliyiz` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-a.efsaneler2.can.re/.../thumbnail.avif` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Dram, Yetişkin, Romantizm |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Güçlü Daham Grubu'nun prensesi Jein, lüks içinde yaşıyor — ta ki soğuk ve gizemli Chungjo, nedenini açıklamadığı bir sebepten dolayı onun koruması olana kadar. Aynı çatı altında yaşamaya zorlanan ikili arasında soğuk duvarlar çatlar ve tehlikeli kıvılcımlar uçuşur. Onu korumak, Chungjo'nun planının bir parçası değildi. Ona aşık olmak? Daha da az. |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 56 chapters |  |  |  |
| chapter dates | PASS | 56 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 37 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://cdn-a.efsaneler2.can.re/.../1.1.avif` (image/avif (format: avif), 35909 bytes, 900x2048) |  |  |  |
