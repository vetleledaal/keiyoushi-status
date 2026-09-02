# Extension Validation Report

- Extension: tachiyomi-tr.gafeland-v1.4.32
- Input artifact: JAR
- Generated at: 2026-09-02T16:00:00Z
- Commit: a33777f817110b49128392e320d515273dd94353
- Passed: 35
- Lint: 1
- Warnings: 0
- Skipped: 0
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 3266930735690843593
- Source name: gafeland
- Source language: tr
- Selected manga input: latest offset 0: Küçük Civcivimizin Ebeveyn Bulma Görevi! (`.../kucuk-civcivimizin-ebeveyn-bulma-gorevi`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 10 | Kana Susamış Erkek Başrolün Annesi Oldum (`.../kana-susamis-erkek-basrolun-annesi-oldum`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | success | 10 | Beyaz Kaplanın Kızı Oldum (`.../beyaz-kaplanin-kizi-oldum`) |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 10 | Küçük Civcivimizin Ebeveyn Bulma Görevi! (`.../kucuk-civcivimizin-ebeveyn-bulma-gorevi`) |  | 1-10s |
| latest_next | `fetchLatestUpdates(2)` | success | 10 | Baduk Kızı (`.../baduk-kizi`) |  | 1-10s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Küçük Civcivimizin Ebeveyn Bulma Görevi! (`.../kucuk-civcivimizin-ebeveyn-bulma-gorevi`) |  | 1-10s |
| details | `fetchMangaDetails(manga)` | success | 1 | Küçük Civcivimizin Ebeveyn Bulma Görevi! (`.../kucuk-civcivimizin-ebeveyn-bulma-gorevi`) |  | <1s |
| chapters | `fetchChapterList(manga)` | success | 19 | Bölüm 1 (`.../kucuk-civcivimizin-ebeveyn-bulma-gorevi-bolum-1`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 11 |  |  | 1-10s |

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
| search listing | PASS | Matched selected manga by URL at result offset 0: title=Küçük Civcivimizin Ebeveyn Bulma Görevi!, URL=`.../kucuk-civcivimizin-ebeveyn-bulma-gorevi` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | PASS |  |  |  |  |
| latest pagination | PASS |  |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 41/41 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 41/41 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://gafeland.com/.../AddText_01-31-11.23.52.jpg` (image/jpeg, 365604 bytes, 690x916) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../kucuk-civcivimizin-ebeveyn-bulma-gorevi` |  |  |  |
| details thumbnail URL | PASS | `https://gafeland.com/.../AddText_01-31-11.23.52.jpg` |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Baba-kız serisi, Doğaüstü, Fantastik, Romantik, Sistem |  |  |  |
| details status | PASS | ONGOING (1) |  |  |  |
| details description | PASS | Kişilerin özel güçlerinin ortaya çıktığı bir dünyada, 4 yaşındaki bir kız çocuğu S sınıfı bir avcı olur ancak ailesi yoktur. Ebeveynler bulması için bir göreve atanan çocuk, sonunda ülkenin en iyi avcısı tarafından evlat edinilir. Kendisine bakan kişileri kaydetmesini ve büyümek için “bağlılık puanları” kazanmasını sağlayan yeni bir beceriyle, güçlenmek ve gelişmek için en iyi ebeveynleri toplamak üzere yola çıkar.<br><br>Alternative Names: The Chick-Class, Hunter is Filial |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 19 chapters |  |  |  |
| chapter dates | LINT | All 19 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=19 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 11 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| page load | PASS | `https://gafeland.com/.../01-copy.jpg` (image/jpeg, 604689 bytes, 720x11550) |  |  |  |
