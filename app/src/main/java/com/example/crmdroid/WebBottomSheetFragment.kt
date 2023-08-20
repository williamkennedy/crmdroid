package com.example.crmdroid

import dev.hotwire.turbo.fragments.TurboWebBottomSheetDialogFragment
import dev.hotwire.turbo.nav.TurboNavGraphDestination

@TurboNavGraphDestination(uri = "turbo://fragment/web/bottom/sheet")
class WebBottomSheetFragment : TurboWebBottomSheetDialogFragment() {}