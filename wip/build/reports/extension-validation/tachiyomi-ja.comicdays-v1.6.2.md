# Extension Validation Report

- Extension: tachiyomi-ja.comicdays-v1.6.2
- Input artifact: JAR
- Generated at: 2026-11-19T21:00:00Z
- Commit: 578a9ad98f0b40c91a0def0f4f00fec09a381beb
- Passed: 32
- Lint: 1
- Warnings: 0
- Skipped: 4
- Failed: 0
- Retry disposition: NOT_APPLICABLE

## Runtime Evidence

- Extension library: 1.6
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source theme: gigaviewer
- Source ID: 5332604811772266259
- Source name: Comic Days
- Source language: ja
- Selected manga input: popular offset 0: 追放されたチート付与魔術師は気ままなセカンドライフを謳歌する。 ～俺は武器だけじゃなく、あらゆるものに『強化ポイント』を付与できるし、俺の意思でいつでも効果を解除できるけど、残った人たち大丈夫？～ (`.../3269754496723134437`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `getPopularManga(1)` | success | 369 | 追放されたチート付与魔術師は気ままなセカンドライフを謳歌する。 ～俺は武器だけじゃなく、あらゆるものに『強化ポイント』を付与できるし、俺の意思でいつでも効果を解除できるけど、残った人たち大丈夫？～ (`.../3269754496723134437`) |  | 1-10s |
| popular_next | `getPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `getLatestUpdates(1)` | success | 369 | Ｓランクパーティから解雇された【呪具師】～『呪いのアイテム』しか作れませんが、その性能はアーティファクト級なり……！～ (`.../3269754496723079577`) |  | 1-10s |
| latest_next | `getLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `getSearchManga(1, query, getFilterList())` | success | 1 | 追放されたチート付与魔術師は気ままなセカンドライフを謳歌する。 ～俺は武器だけじゃなく、あらゆるものに『強化ポイント』を付与できるし、俺の意思でいつでも効果を解除できるけど、残った人たち大丈夫？～ (`.../3269754496723134437`) |  | 1-10s |
| details | `getMangaUpdate(manga, emptyList(), true, false)` | success | 1 | 追放されたチート付与魔術師は気ままなセカンドライフを謳歌する。 ～俺は武器だけじゃなく、あらゆるものに『強化ポイント』を付与できるし、俺の意思でいつでも効果を解除できるけど、残った人たち大丈夫？～ (`.../3269754496723134437`) |  | 1-10s |
| chapters | `reuse details chapters or getMangaUpdate(manga, emptyList(), false, true)` | success | 129 | (Volume) 追放されたチート付与魔術師は気ままなセカンドライフを謳歌する。　～俺は武器だけじゃなく、あらゆるものに『強化ポイント』を付与できるし、俺の意思でいつでも効果を解除できるけど、残った人たち大丈夫？～（１） (`.../3269754496723428717`) |  | 1-10s |
| pages | `getPageList(chapter)` | success | 163 |  |  | 1-10s |

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
| popular listing | PASS | 369 entries |  |  |  |
| latest listing | PASS | 369 entries |  |  |  |
| search listing | PASS | Matched selected manga by URL at result offset 0: title=追放されたチート付与魔術師は気ままなセカンドライフを謳歌する。 ～俺は武器だけじゃなく、あらゆるものに『強化ポイント』を付与できるし、俺の意思でいつでも効果を解除できるけど、残った人たち大丈夫？～, URL=`3269754496723134437` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | PASS |  |  |  |  |
| manga title and URL | PASS | 739/739 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 739/739 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | PASS |  |  |  |  |
| thumbnail | PASS | `https://cdn-img.comic-days.com/.../3269754496723134437-6bfac4fd50e87b54bd76e028fd6ec1eb <redacted query values: 1770614045>` (image/jpeg, 278735 bytes, 1125x633) |  |  |  |
| details identity | PASS | Details preserved selected URL `3269754496723134437` |  |  |  |
| details thumbnail URL | PASS | `https://cdn-img.comic-days.com/.../3269754496723134437-6bfac4fd50e87b54bd76e028fd6ec1eb <redacted query values: 1770614045>` |  |  |  |
| details author | PASS | 業務用餅.../%EF%BD%8B%EF%BD%89%EF%BD%93%EF%BD%95%EF%BD%89 |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | null |  |  |  |
| details status | LINT | UNKNOWN (0); use a concrete status when known |  |  |  |
| details description | PASS | 魔力を使い武器や防具を強化する強化魔術師レインは、ある日ギルド内の全ての武器防具が十分強くなったという理由で所属ギルドから追放されてしまう。あまりの理不尽な仕打ちに、レインはこれまで強化していた魔力を返してもらうことにした。これまで様々な装備に付与してきた膨大な魔力。とりあえず適当な銅の剣に付与したら、強化ポイント＋１００００のチート装備が誕生してしまい！？戦闘経験ゼロの魔術師が、どんなものでもチート装備にできる魔法で新たな冒険者ライフを気ままに生きることに！！ |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 129 chapters |  |  |  |
| chapter dates | PASS | 129 positive upload dates |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 163 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `https://cdn-img.comic-days.com/.../3269754496723439783-ade9b5f52ffd435b18f3e535cf8edd39` (image/jpeg, 322541 bytes, 1125x1600) |  |  |  |
